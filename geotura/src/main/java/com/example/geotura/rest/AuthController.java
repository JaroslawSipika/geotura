package com.example.geotura.rest;

import com.example.geotura.dao.AdminRepository;
import com.example.geotura.dao.ClientRepository;
import com.example.geotura.dao.UserRepository;
import com.example.geotura.model.PrincipalProvider;
import com.example.geotura.model.User;
import com.example.geotura.rest.DTO.UserType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Pattern;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/login")
    public ResponseEntity login(User user) {

        try{
            return isValid(user);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Bez autoryzacji");
        }
    }

    public ResponseEntity<UserType> isValid(User user) {
        User userByEmail = userRepository.getUserByEmail(user.getEmail());

        checkPassword(user);

        boolean isPasswordValid = true;
//      boolean isPasswordValid = userByEmail.getPassword().equals(user.getPassword());

        if (isPasswordValid) {
            PrincipalProvider.storeCurrentUser(userByEmail);
            List<Integer> allAdminUserIdIds = adminRepository.findAllAdminUserIdIds();
            List<Integer> allClientUserIdIds = clientRepository.findAllClientUserIdIds();

            if (allAdminUserIdIds.contains(userByEmail.getIduser())) {
                PrincipalProvider.setUserType("ADMIN");
                return ResponseEntity.ok(new UserType("ADMIN"));
            } else if (allClientUserIdIds.contains(userByEmail.getIduser())) {
                PrincipalProvider.setUserType("CLIENT");
                return ResponseEntity.ok(new UserType("CLIENT"));
            }

        }
        throw new RuntimeException();
    }


    public void checkPassword(User user){
        User userByEmail = userRepository.getUserByEmail(user.getEmail());
        assertEquals(userByEmail.getPassword(),user.getPassword());
    }


    @GetMapping("/logout")
    public ResponseEntity logout() {
        PrincipalProvider.clearCurrentUser();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/registration")
    public ResponseEntity addClientUser(User user) {

        try {
            return addClientUser1(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Użytkownik już istnieje");
        }
    }


    public ResponseEntity<Object> addClientUser1(User user){

        boolean emailExist = userRepository.getUserByEmailBoolean(user.getEmail());

        checkRegexPassword(user);
        checkRegexEmail(user);


        if(!(emailExist))
        {
            List<Integer> allUserId = userRepository.findAllUserId();
            Integer id = allUserId.get(allUserId.size()-1)+1;
            List<Integer> allClientId = clientRepository.findAllClientId();
            Integer ids = allClientId.get(allClientId.size()-1)+1;

            LocalDate localDate = LocalDate.now();

            userRepository.registrationOneUser(id, localDate, user.getEmail(), user.getFirstName(), user.getLastName(), user.getPassword());
            clientRepository.registrationOneClient(ids, id);
            return ResponseEntity.ok().build();
        }else{
            throw new RuntimeException();
        }
    }

    public void checkRegexPassword(User user){
        assertTrue("Nieprawidłowy format hasła",user.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$"));
    }

    public void checkRegexEmail (User user){
        assertTrue("Nieprawidłowy format emaila",user.getEmail().matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$"));
    }

}
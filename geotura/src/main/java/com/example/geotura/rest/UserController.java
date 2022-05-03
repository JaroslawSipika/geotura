package com.example.geotura.rest;

import com.example.geotura.dao.AdminRepository;
import com.example.geotura.dao.ClientRepository;
import com.example.geotura.dao.UserRepository;
import com.example.geotura.model.*;
import com.example.geotura.rest.DTO.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;



    @GetMapping("/name")
    public ResponseEntity getNameforUser() {
        String name = "" ;
        if (PrincipalProvider.isAdmin()) {
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            name = userRepository.getUserNameById(id);
        } else {
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            name = userRepository.getUserNameById(id);
        }
        return ResponseEntity.ok(name);
    }

    @GetMapping("/all")
    public ResponseEntity getUsers() {
        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();
        List<User> dataClient = userRepository.findAllUser(id);
        return ResponseEntity.ok(dataClient);
    }

    @GetMapping("/info")
    public ResponseEntity getUserOne() {
        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();
        List<User> dataClient = userRepository.findAllUser1(id);
        return ResponseEntity.ok(dataClient);
    }

    @GetMapping("/info1")
    public ResponseEntity getUsers1() {
        List<User> dataClient = userRepository.findAllUsers1();
        return ResponseEntity.ok(dataClient);
    }

    @PostMapping("/update")
    public ResponseEntity updateUser(User user) {

        try {
            return updateUser111(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Błędne zapytanie");
        }
    }

    ResponseEntity<Object> updateUser111(User user){

        checkRegexPasswordUpdate(user);
        checkRegexEmailUpdate(user);

        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();

        userRepository.updateUser(id,user.getEmail(),user.getFirstName(),user.getLastName(),user.getPassword());

        return ResponseEntity.ok().build();
    }


    @PostMapping("/delete")
    public ResponseEntity deleteUser(User user) {

        try {
            return deleteUser11(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nie przekazane uprawnienia");
        }
    }

    public ResponseEntity<Object> deleteUser11(User user){

        if (PrincipalProvider.isAdmin()) {
            if(adminRepository.findAllAdminIdInteger() > 1){
                User currentUser = PrincipalProvider.getCurrentUser();
                Integer id = currentUser.getIduser();
                userRepository.deleteUser(id, user.getFirstName());
                return ResponseEntity.ok().build();
            }
            else{
                throw new RuntimeException();
            }

        } else {
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            userRepository.deleteUser(id, user.getFirstName());
            return ResponseEntity.ok().build();
        }
    }


    @PostMapping("/update1")
    public ResponseEntity updateUser1(User user) {

        try {
            return updateUser11(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Błędne zapytanie");
        }
    }

    ResponseEntity<Object> updateUser11(User user){

        checkRegexPasswordUpdate(user);
        checkRegexEmailUpdate(user);

        userRepository.updateUser1(user.getIduser(),user.getEmail(),user.getFirstName(),user.getLastName(),user.getPassword());
        return ResponseEntity.ok().build();

    }

    public void checkRegexPasswordUpdate(User user){
        assertTrue("Nieprawidłowy format hasła",user.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$"));
    }

    public void checkRegexEmailUpdate (User user){
        assertTrue("Nieprawidłowy format emaila",user.getEmail().matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$"));
    }








    @PostMapping("/delete1")
    public ResponseEntity deleteUser1(User user) {

        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();


        List<Integer> allAdminUserIdIds = adminRepository.findAllAdminUserIdIds();

        if (allAdminUserIdIds.contains(user.getIduser())) {
            return ResponseEntity.ok().build();
        } else {
            userRepository.deleteUser1(user.getIduser(), user.getFirstName());
            return ResponseEntity.ok().build();
        }
    }



    @PostMapping("/admin")
    public ResponseEntity addUserAdmin(User user) {


        List<Integer> allAdminUserIdIds = adminRepository.findAllAdminUserIdIds();

        if (allAdminUserIdIds.contains(user.getIduser())) {
            return ResponseEntity.ok().build();
        } else {
            List<Integer> allAdminId = adminRepository.findAllAdminId();
            Integer id = allAdminId.get(allAdminId.size()-1)+1;
            adminRepository.createAdmin(id, user.getIduser());
            return ResponseEntity.ok().build();
        }

    }



}


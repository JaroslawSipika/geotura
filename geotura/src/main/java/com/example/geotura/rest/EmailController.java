package com.example.geotura.rest;


import com.example.geotura.dao.EmailRepository;
import com.example.geotura.dao.MountainRepository;
import com.example.geotura.dao.UserRepository;
import com.example.geotura.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/create")
    public ResponseEntity addEmail(Email email) {

        try {
            return addEmail1(email);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Brak użytkownika");
        }
    }

    public ResponseEntity<Object> addEmail1(Email email){

        checkEmail(email);

        if  (email.getIdreceiver() != null){
            List<Integer> allEmailId = emailRepository.findAllEmailId();
            Integer id = allEmailId.get(allEmailId.size()-1)+1;

            User currentUser = PrincipalProvider.getCurrentUser();
            Integer idu = currentUser.getIduser();
            List<User> dataClient = userRepository.findAllUser(id);

            LocalDate date = LocalDate.now();

            emailRepository.createOneEmail(id, email.getIdreceiver(),idu, email.getText(), date);
            return ResponseEntity.ok().build();
        }
        else{
            throw new RuntimeException();
        }
    }

    public void checkEmail(Email email){
        assertTrue("Nie uzupełniłeś treści emaila",email.getText()!="");
    }


    @GetMapping("/all")
    public ResponseEntity getEmails() {
        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();
        List<EmailUser> dataClient = emailRepository.findAllEmailIds(id);
        return ResponseEntity.ok(dataClient);
    }

    @PostMapping("/delete")
    public ResponseEntity deleteEmail(Email email) {

        emailRepository.deleteOneEmail(email.getIdemail());

        return ResponseEntity.ok().build();
    }







}

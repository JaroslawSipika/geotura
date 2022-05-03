package com.example.geotura.rest;

import com.example.geotura.dao.PhotoRepository;
import com.example.geotura.model.DateActivityMountain;
import com.example.geotura.model.DateActivityPhotoMountain;
import com.example.geotura.model.PrincipalProvider;
import com.example.geotura.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;



    @GetMapping("/find")
    public ResponseEntity getPhotos() {
        List<DateActivityPhotoMountain> dataClient = null;
        if (PrincipalProvider.isAdmin()) {
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = photoRepository.findAllPhotoById(id);
        }
        else {
            // List<DateActivityMountain> dataClient;
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = photoRepository.findAllPhotoById(id);
            // return ResponseEntity.ok(dataClient);
        }
        return ResponseEntity.ok(dataClient);
    }

    @GetMapping("/find1")
    public ResponseEntity getPhotos1() {
        List<DateActivityPhotoMountain> dataClient = null;
        if (PrincipalProvider.isAdmin()) {
           // List<DateActivityMountain> dataClient;
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = photoRepository.findAllPhotoById1(id);
        }
        else {
          //  List<DateActivityMountain> dataClient;
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = photoRepository.findAllPhotoById1(id);
            // return ResponseEntity.ok(dataClient);
        }
        return ResponseEntity.ok(dataClient);
    }

    @GetMapping("/find2")
    public ResponseEntity getPhotos2() {
        List<DateActivityPhotoMountain> dataClient = null;
        if (PrincipalProvider.isAdmin()) {
            // List<DateActivityMountain> dataClient;
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = photoRepository.findAllPhotoById2(id);
        }
        else {
            //  List<DateActivityMountain> dataClient;
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = photoRepository.findAllPhotoById2(id);
            // return ResponseEntity.ok(dataClient);
        }
        return ResponseEntity.ok(dataClient);
    }



    @PostMapping("/create")
    public ResponseEntity addPhoto(DateActivityPhotoMountain dateActivityPhotoMountain) {

        try {
            return addPhoto1(dateActivityPhotoMountain);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Złe zapytanie");
        }
    }

    public ResponseEntity<Object> addPhoto1(DateActivityPhotoMountain dateActivityPhotoMountain){

        if(!(dateActivityPhotoMountain.getLink().isEmpty())){
            List<Integer> allPhotoId = photoRepository.findAllPhotoId();
            Integer id;
            if (allPhotoId.isEmpty()){
                id = 1;
            }
            else{
                id = allPhotoId.get(allPhotoId.size()-1)+1;
            }
            photoRepository.createOnePhoto(id, dateActivityPhotoMountain.getLink(), dateActivityPhotoMountain.getIddateactivity());
            return ResponseEntity.ok().build();
        }
        else {
            throw new RuntimeException();
        }
    }
}

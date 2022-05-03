package com.example.geotura.rest;

import com.example.geotura.dao.ClientRepository;
import com.example.geotura.dao.DateActivityRepository;
import com.example.geotura.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dateactivity")
public class DateActivityController {

    @Autowired
    private DateActivityRepository dateActivityRepository;
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/mountain")
    public ResponseEntity getDateActivity() {
        List<DateActivityMountain> dataClient = null;

        if (PrincipalProvider.isAdmin()) {
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = dateActivityRepository.findAllDateActivityById(id);
        }
        else {
            // List<DateActivityMountain> dataClient;
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();
            dataClient = dateActivityRepository.findAllDateActivityById(id);
            // return ResponseEntity.ok(dataClient);
        }
        return ResponseEntity.ok(dataClient);

    }

    @PostMapping("/update")
    public ResponseEntity updateDateActivity(DateActivity dateActivity) {

        try {
            return updateDateActivity1(dateActivity);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Złe zapytanie");
        }
    }

    public ResponseEntity<Object> updateDateActivity1(DateActivity dateActivity){

        LocalDate date = LocalDate.now();

        if ((dateActivity.getEndDate().isAfter(dateActivity.getCreateDate()) || dateActivity.getEndDate().isEqual(date) ) && (dateActivity.getEndDate().isEqual(date) || dateActivity.getEndDate().isBefore(date))) {
            User currentUser = PrincipalProvider.getCurrentUser();
            Integer id = currentUser.getIduser();

            dateActivityRepository.updateDateActivityByIdUser(id, dateActivity.getEndDate(), dateActivity.getIddateactivity());
            return ResponseEntity.ok().build();
        }
        else{
            throw new RuntimeException();
        }
    }







    @PostMapping("/create")
    public ResponseEntity addDateActivity(DateActivityMountain dateActivityMountain) {

        List<Integer> allDateActivityId = dateActivityRepository.findAllDateActivityId();
        Integer id;

        if (allDateActivityId.isEmpty()){
            id = 1;
        }
        else{
            id = allDateActivityId.get(allDateActivityId.size() - 1) + 1;
        }

        LocalDate date = LocalDate.now();
        User currentUser = PrincipalProvider.getCurrentUser();
        Integer iduser = currentUser.getIduser();

        dateActivityRepository.createOneDateActivity(id, date, null, iduser, dateActivityMountain.getIdmountain());
        return ResponseEntity.ok().build();


    }



    @GetMapping("/statystyki")
    public ResponseEntity getStatistics() {

        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();

        List<Object> lista = new ArrayList<Object>();
        Integer ilosctras = dateActivityRepository.findNumberOfRowsById(id);
        Float sumakilometrow = dateActivityRepository.findSumKilometers(id);
        Float najwyzszypunkt = dateActivityRepository.findBiggest(id);
        Float najdluzszatrasa = dateActivityRepository.findLongest(id);
        lista.add(ilosctras);
        lista.add(sumakilometrow);
        lista.add(najwyzszypunkt);
        lista.add(najdluzszatrasa);
        return ResponseEntity.ok(lista);
    }


    @PostMapping("/delete")
    public ResponseEntity deleteDateActivity(DateActivity dateActivity) {


        dateActivityRepository.deleteDateActivity(dateActivity.getIddateactivity());

        return ResponseEntity.ok().build();
    }





}

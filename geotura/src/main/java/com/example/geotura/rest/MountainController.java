package com.example.geotura.rest;

import com.example.geotura.dao.MountainRepository;
import com.example.geotura.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import static org.testng.AssertJUnit.assertTrue;

@RestController
@RequestMapping("/mountain")
public class MountainController {

    @Autowired
    private MountainRepository mountainRepository;

    @GetMapping("/all")
    public ResponseEntity getMountain() {
        List<Mountain> dataClient = mountainRepository.findAllMountain();
        return ResponseEntity.ok(dataClient);
    }


    @GetMapping("/statystyki")
    public ResponseEntity getStatistics() {

        List<Object> lista = new ArrayList<Object>();
        Integer ilosctrastatry = mountainRepository.findilosctrastatry();
        Integer ilosctraspieniny = mountainRepository.findilosctraspieniny();
        Integer ilosctrasbeskidslaski = mountainRepository.findilosctrasbeskidslaski();
        Integer ilosctrasbeskidmaly = mountainRepository.findilosctrasbeskidmaly();
        Integer ilosctrasbeskidzywiecki = mountainRepository.findilosctrasbeskidzywiecki();
        Integer ilosctrasgorce = mountainRepository.findilosctrasgorce();
        Integer ilosctrasbeskidsadecki = mountainRepository.findilosctrasbeskidsadecki();
        Integer ilosctrasbeskidniski = mountainRepository.findilosctrasbeskidniski();
        Integer ilosctrasbieszczady = mountainRepository.findilosctrasbieszczady();
        Integer ilosctrasbeskidmakowski = mountainRepository.findilosctrasbeskidmakowski();
        Integer ilosctrasbeskidwyspowy = mountainRepository.findilosctrasbeskidwyspowy();
        Integer ilosctrastatryzachodnie = mountainRepository.findilosctrastatryzachodnie();
        Integer ilosctrasgorysanockoturczanskie = mountainRepository.findilosctrasgorysanockoturczanskie();
        Integer ilosctrasgoryizerskie = mountainRepository.findilosctrasgoryizerskie();
        Integer ilosctraskarkonosze = mountainRepository.findilosctraskarkonosze();
        Integer ilosctrasgorykaczawskie = mountainRepository.findilosctrasgorykaczawskie();
        Integer ilosctrasrudawyjanowickie = mountainRepository.findilosctrasrudawyjanowickie();
        Integer ilosctrasgorywalbrzyskie = mountainRepository.findilosctrasgorywalbrzyskie();
        Integer ilosctrasgorykamienne = mountainRepository.findilosctrasgorykamienne();
        Integer ilosctrasgoryjastrzebie = mountainRepository.findilosctrasgoryjastrzebie();
        Integer ilosctrasgorystolowe = mountainRepository.findilosctrasgorystolowe();
        Integer ilosctrasgoryorlickieibystrzyckie = mountainRepository.findilosctrasgoryorlickieibystrzyckie();
        Integer ilosctrasgorysowie = mountainRepository.findilosctrasgorysowie();
        Integer ilosctrasgorybardzkie = mountainRepository.findilosctrasgorybardzkie();
        Integer ilosctrasgoryzloteibialskie = mountainRepository.findilosctrasgoryzloteibialskie();
        Integer ilosctrasmasywsnieznika = mountainRepository.findilosctrasmasywsnieznika();
        Integer ilosctrasgoryopawskie = mountainRepository.findilosctrasgoryopawskie();
        Integer ilosctrasmasywslezy = mountainRepository.findilosctrasmasywslezy();
        Integer ilosctrasgoryswietokrzyskie = mountainRepository.findilosctrasgoryswietokrzyskie();


        User currentUser = PrincipalProvider.getCurrentUser();
        Integer id = currentUser.getIduser();

        Integer ilosctrastatryz = mountainRepository.findilosctrastatryz(id);
        Integer ilosctraspieninyz = mountainRepository.findilosctraspieninyz(id);
        Integer ilosctrasbeskidslaskiz = mountainRepository.findilosctrasbeskidslaskiz(id);
        Integer ilosctrasbeskidmalyz = mountainRepository.findilosctrasbeskidmalyz(id);
        Integer ilosctrasbeskidzywieckiz = mountainRepository.findilosctrasbeskidzywieckiz(id);
        Integer ilosctrasgorcez = mountainRepository.findilosctrasgorcez(id);
        Integer ilosctrasbeskidsadeckiz = mountainRepository.findilosctrasbeskidsadeckiz(id);
        Integer ilosctrasbeskidniskiz = mountainRepository.findilosctrasbeskidniskiz(id);
        Integer ilosctrasbieszczadyz = mountainRepository.findilosctrasbieszczadyz(id);
        Integer ilosctrasbeskidmakowskiz = mountainRepository.findilosctrasbeskidmakowskiz(id);
        Integer ilosctrasbeskidwyspowyz = mountainRepository.findilosctrasbeskidwyspowyz(id);
        Integer ilosctrastatryzachodniez = mountainRepository.findilosctrastatryzachodniez(id);
        Integer ilosctrasgorysanockoturczanskiez = mountainRepository.findilosctrasgorysanockoturczanskiez(id);
        Integer ilosctrasgoryizerskiez = mountainRepository.findilosctrasgoryizerskiez(id);
        Integer ilosctraskarkonoszez = mountainRepository.findilosctraskarkonoszez(id);
        Integer ilosctrasgorykaczawskiez = mountainRepository.findilosctrasgorykaczawskiez(id);
        Integer ilosctrasrudawyjanowickiez = mountainRepository.findilosctrasrudawyjanowickiez(id);
        Integer ilosctrasgorywalbrzyskiez = mountainRepository.findilosctrasgorywalbrzyskiez(id);
        Integer ilosctrasgorykamiennez = mountainRepository.findilosctrasgorykamiennez(id);
        Integer ilosctrasgoryjastrzebiez = mountainRepository.findilosctrasgoryjastrzebiez(id);
        Integer ilosctrasgorystolowez = mountainRepository.findilosctrasgorystolowez(id);
        Integer ilosctrasgoryorlickieibystrzyckiez = mountainRepository.findilosctrasgoryorlickieibystrzyckiez(id);
        Integer ilosctrasgorysowiez = mountainRepository.findilosctrasgorysowiez(id);
        Integer ilosctrasgorybardzkiez = mountainRepository.findilosctrasgorybardzkiez(id);
        Integer ilosctrasgoryzloteibialskiez = mountainRepository.findilosctrasgoryzloteibialskiez(id);
        Integer ilosctrasmasywsnieznikaz = mountainRepository.findilosctrasmasywsnieznikaz(id);
        Integer ilosctrasgoryopawskiez = mountainRepository.findilosctrasgoryopawskiez(id);
        Integer ilosctrasmasywslezyz = mountainRepository.findilosctrasmasywslezyz(id);
        Integer ilosctrasgoryswietokrzyskiez = mountainRepository.findilosctrasgoryswietokrzyskiez(id);

        Integer ilosctrastatryu = mountainRepository.findilosctrastatryu(id);
        Integer ilosctraspieninyu = mountainRepository.findilosctraspieninyu(id);
        Integer ilosctrasbeskidslaskiu = mountainRepository.findilosctrasbeskidslaskiu(id);
        Integer ilosctrasbeskidmalyu = mountainRepository.findilosctrasbeskidmalyu(id);
        Integer ilosctrasbeskidzywieckiu = mountainRepository.findilosctrasbeskidzywieckiu(id);
        Integer ilosctrasgorceu = mountainRepository.findilosctrasgorceu(id);
        Integer ilosctrasbeskidsadeckiu = mountainRepository.findilosctrasbeskidsadeckiu(id);
        Integer ilosctrasbeskidniskiu = mountainRepository.findilosctrasbeskidniskiu(id);
        Integer ilosctrasbieszczadyu = mountainRepository.findilosctrasbieszczadyu(id);
        Integer ilosctrasbeskidmakowskiu = mountainRepository.findilosctrasbeskidmakowskiu(id);
        Integer ilosctrasbeskidwyspowyu = mountainRepository.findilosctrasbeskidwyspowyu(id);
        Integer ilosctrastatryzachodnieu = mountainRepository.findilosctrastatryzachodnieu(id);
        Integer ilosctrasgorysanockoturczanskieu = mountainRepository.findilosctrasgorysanockoturczanskieu(id);
        Integer ilosctrasgoryizerskieu = mountainRepository.findilosctrasgoryizerskieu(id);
        Integer ilosctraskarkonoszeu = mountainRepository.findilosctraskarkonoszeu(id);
        Integer ilosctrasgorykaczawskieu = mountainRepository.findilosctrasgorykaczawskieu(id);
        Integer ilosctrasrudawyjanowickieu = mountainRepository.findilosctrasrudawyjanowickieu(id);
        Integer ilosctrasgorywalbrzyskieu = mountainRepository.findilosctrasgorywalbrzyskieu(id);
        Integer ilosctrasgorykamienneu = mountainRepository.findilosctrasgorykamienneu(id);
        Integer ilosctrasgoryjastrzebieu = mountainRepository.findilosctrasgoryjastrzebieu(id);
        Integer ilosctrasgorystoloweu = mountainRepository.findilosctrasgorystoloweu(id);
        Integer ilosctrasgoryorlickieibystrzyckieu = mountainRepository.findilosctrasgoryorlickieibystrzyckieu(id);
        Integer ilosctrasgorysowieu = mountainRepository.findilosctrasgorysowieu(id);
        Integer ilosctrasgorybardzkieu = mountainRepository.findilosctrasgorybardzkieu(id);
        Integer ilosctrasgoryzloteibialskieu = mountainRepository.findilosctrasgoryzloteibialskieu(id);
        Integer ilosctrasmasywsnieznikau = mountainRepository.findilosctrasmasywsnieznikau(id);
        Integer ilosctrasgoryopawskieu = mountainRepository.findilosctrasgoryopawskieu(id);
        Integer ilosctrasmasywslezyu = mountainRepository.findilosctrasmasywslezyu(id);
        Integer ilosctrasgoryswietokrzyskieu = mountainRepository.findilosctrasgoryswietokrzyskieu(id);

        Float ilosctrastatryd = mountainRepository.findilosctrastatryd(id);
        Float ilosctraspieninyd = mountainRepository.findilosctraspieninyd(id);
        Float ilosctrasbeskidslaskid = mountainRepository.findilosctrasbeskidslaskid(id);
        Float ilosctrasbeskidmalyd = mountainRepository.findilosctrasbeskidmalyd(id);
        Float ilosctrasbeskidzywieckid = mountainRepository.findilosctrasbeskidzywieckid(id);
        Float ilosctrasgorced = mountainRepository.findilosctrasgorced(id);
        Float ilosctrasbeskidsadeckid = mountainRepository.findilosctrasbeskidsadeckid(id);
        Float ilosctrasbeskidniskid = mountainRepository.findilosctrasbeskidniskid(id);
        Float ilosctrasbieszczadyd = mountainRepository.findilosctrasbieszczadyd(id);
        Float ilosctrasbeskidmakowskid = mountainRepository.findilosctrasbeskidmakowskid(id);
        Float ilosctrasbeskidwyspowyd = mountainRepository.findilosctrasbeskidwyspowyd(id);
        Float ilosctrastatryzachodnied = mountainRepository.findilosctrastatryzachodnied(id);
        Float ilosctrasgorysanockoturczanskied = mountainRepository.findilosctrasgorysanockoturczanskied(id);
        Float ilosctrasgoryizerskied = mountainRepository.findilosctrasgoryizerskied(id);
        Float ilosctraskarkonoszed = mountainRepository.findilosctraskarkonoszed(id);
        Float ilosctrasgorykaczawskied = mountainRepository.findilosctrasgorykaczawskied(id);
        Float ilosctrasrudawyjanowickied = mountainRepository.findilosctrasrudawyjanowickied(id);
        Float ilosctrasgorywalbrzyskied = mountainRepository.findilosctrasgorywalbrzyskied(id);
        Float ilosctrasgorykamienned = mountainRepository.findilosctrasgorykamienned(id);
        Float ilosctrasgoryjastrzebied = mountainRepository.findilosctrasgoryjastrzebied(id);
        Float ilosctrasgorystolowed = mountainRepository.findilosctrasgorystolowed(id);
        Float ilosctrasgoryorlickieibystrzyckied = mountainRepository.findilosctrasgoryorlickieibystrzyckied(id);
        Float ilosctrasgorysowied = mountainRepository.findilosctrasgorysowied(id);
        Float ilosctrasgorybardzkied = mountainRepository.findilosctrasgorybardzkied(id);
        Float ilosctrasgoryzloteibialskied = mountainRepository.findilosctrasgoryzloteibialskied(id);
        Float ilosctrasmasywsnieznikad = mountainRepository.findilosctrasmasywsnieznikad(id);
        Float ilosctrasgoryopawskied = mountainRepository.findilosctrasgoryopawskied(id);
        Float ilosctrasmasywslezyd = mountainRepository.findilosctrasmasywslezyd(id);
        Float ilosctrasgoryswietokrzyskied = mountainRepository.findilosctrasgoryswietokrzyskied(id);

        Date ilosctrastatryc = mountainRepository.findilosctrastatryc(id);
        Date ilosctraspieninyc = mountainRepository.findilosctraspieninyc(id);
        Date ilosctrasbeskidslaskic = mountainRepository.findilosctrasbeskidslaskic(id);
        Date ilosctrasbeskidmalyc = mountainRepository.findilosctrasbeskidmalyc(id);
        Date ilosctrasbeskidzywieckic = mountainRepository.findilosctrasbeskidzywieckic(id);
        Date ilosctrasgorcec = mountainRepository.findilosctrasgorcec(id);
        Date ilosctrasbeskidsadeckic = mountainRepository.findilosctrasbeskidsadeckic(id);
        Date ilosctrasbeskidniskic = mountainRepository.findilosctrasbeskidniskic(id);
        Date ilosctrasbieszczadyc = mountainRepository.findilosctrasbieszczadyc(id);
        Date ilosctrasbeskidmakowskic = mountainRepository.findilosctrasbeskidmakowskic(id);
        Date ilosctrasbeskidwyspowyc = mountainRepository.findilosctrasbeskidwyspowyc(id);
        Date ilosctrastatryzachodniec = mountainRepository.findilosctrastatryzachodniec(id);
        Date ilosctrasgorysanockoturczanskiec = mountainRepository.findilosctrasgorysanockoturczanskiec(id);
        Date ilosctrasgoryizerskiec = mountainRepository.findilosctrasgoryizerskiec(id);
        Date ilosctraskarkonoszec = mountainRepository.findilosctraskarkonoszec(id);
        Date ilosctrasgorykaczawskiec = mountainRepository.findilosctrasgorykaczawskiec(id);
        Date ilosctrasrudawyjanowickiec = mountainRepository.findilosctrasrudawyjanowickiec(id);
        Date ilosctrasgorywalbrzyskiec = mountainRepository.findilosctrasgorywalbrzyskiec(id);
        Date ilosctrasgorykamiennec = mountainRepository.findilosctrasgorykamiennec(id);
        Date ilosctrasgoryjastrzebiec = mountainRepository.findilosctrasgoryjastrzebiec(id);
        Date ilosctrasgorystolowec = mountainRepository.findilosctrasgorystolowec(id);
        Date ilosctrasgoryorlickieibystrzyckiec = mountainRepository.findilosctrasgoryorlickieibystrzyckiec(id);
        Date ilosctrasgorysowiec = mountainRepository.findilosctrasgorysowiec(id);
        Date ilosctrasgorybardzkiec = mountainRepository.findilosctrasgorybardzkiec(id);
        Date ilosctrasgoryzloteibialskiec = mountainRepository.findilosctrasgoryzloteibialskiec(id);
        Date ilosctrasmasywsnieznikac = mountainRepository.findilosctrasmasywsnieznikac(id);
        Date ilosctrasgoryopawskiec = mountainRepository.findilosctrasgoryopawskiec(id);
        Date ilosctrasmasywslezyc = mountainRepository.findilosctrasmasywslezyc(id);
        Date ilosctrasgoryswietokrzyskiec = mountainRepository.findilosctrasgoryswietokrzyskiec(id);


        lista.add(ilosctrastatry);
        lista.add(ilosctrastatryzachodnie);
        lista.add(ilosctraspieniny);
        lista.add(ilosctrasbeskidslaski);
        lista.add(ilosctrasbeskidmaly);
        lista.add(ilosctrasbeskidzywiecki);
        lista.add(ilosctrasgorce);
        lista.add(ilosctrasbeskidsadecki);
        lista.add(ilosctrasbeskidniski);
        lista.add(ilosctrasbeskidmakowski);
        lista.add(ilosctrasbeskidwyspowy);
        lista.add(ilosctrasbieszczady);
        lista.add(ilosctrasgorysanockoturczanskie);
        lista.add(ilosctrasgoryizerskie);
        lista.add(ilosctraskarkonosze);
        lista.add(ilosctrasgorykaczawskie);
        lista.add(ilosctrasrudawyjanowickie);
        lista.add(ilosctrasgorywalbrzyskie);
        lista.add(ilosctrasgorykamienne);
        lista.add(ilosctrasgoryjastrzebie);
        lista.add(ilosctrasgorystolowe);
        lista.add(ilosctrasgoryorlickieibystrzyckie);
        lista.add(ilosctrasgorysowie);
        lista.add(ilosctrasgorybardzkie);
        lista.add(ilosctrasgoryzloteibialskie);
        lista.add(ilosctrasmasywsnieznika);
        lista.add(ilosctrasgoryopawskie);
        lista.add(ilosctrasmasywslezy);
        lista.add(ilosctrasgoryswietokrzyskie);

        lista.add(ilosctrastatryz);
        lista.add(ilosctrastatryzachodniez);
        lista.add(ilosctraspieninyz);
        lista.add(ilosctrasbeskidslaskiz);
        lista.add(ilosctrasbeskidmalyz);
        lista.add(ilosctrasbeskidzywieckiz);
        lista.add(ilosctrasgorcez);
        lista.add(ilosctrasbeskidsadeckiz);
        lista.add(ilosctrasbeskidniskiz);
        lista.add(ilosctrasbeskidmakowskiz);
        lista.add(ilosctrasbeskidwyspowyz);
        lista.add(ilosctrasbieszczadyz);
        lista.add(ilosctrasgorysanockoturczanskiez);
        lista.add(ilosctrasgoryizerskiez);
        lista.add(ilosctraskarkonoszez);
        lista.add(ilosctrasgorykaczawskiez);
        lista.add(ilosctrasrudawyjanowickiez);
        lista.add(ilosctrasgorywalbrzyskiez);
        lista.add(ilosctrasgorykamiennez);
        lista.add(ilosctrasgoryjastrzebiez);
        lista.add(ilosctrasgorystolowez);
        lista.add(ilosctrasgoryorlickieibystrzyckiez);
        lista.add(ilosctrasgorysowiez);
        lista.add(ilosctrasgorybardzkiez);
        lista.add(ilosctrasgoryzloteibialskiez);
        lista.add(ilosctrasmasywsnieznikaz);
        lista.add(ilosctrasgoryopawskiez);
        lista.add(ilosctrasmasywslezyz);
        lista.add(ilosctrasgoryswietokrzyskiez);

        lista.add(ilosctrastatryu);
        lista.add(ilosctrastatryzachodnieu);
        lista.add(ilosctraspieninyu);
        lista.add(ilosctrasbeskidslaskiu);
        lista.add(ilosctrasbeskidmalyu);
        lista.add(ilosctrasbeskidzywieckiu);
        lista.add(ilosctrasgorceu);
        lista.add(ilosctrasbeskidsadeckiu);
        lista.add(ilosctrasbeskidniskiu);
        lista.add(ilosctrasbeskidmakowskiu);
        lista.add(ilosctrasbeskidwyspowyu);
        lista.add(ilosctrasbieszczadyu);
        lista.add(ilosctrasgorysanockoturczanskieu);
        lista.add(ilosctrasgoryizerskieu);
        lista.add(ilosctraskarkonoszeu);
        lista.add(ilosctrasgorykaczawskieu);
        lista.add(ilosctrasrudawyjanowickieu);
        lista.add(ilosctrasgorywalbrzyskieu);
        lista.add(ilosctrasgorykamienneu);
        lista.add(ilosctrasgoryjastrzebieu);
        lista.add(ilosctrasgorystoloweu);
        lista.add(ilosctrasgoryorlickieibystrzyckieu);
        lista.add(ilosctrasgorysowieu);
        lista.add(ilosctrasgorybardzkieu);
        lista.add(ilosctrasgoryzloteibialskieu);
        lista.add(ilosctrasmasywsnieznikau);
        lista.add(ilosctrasgoryopawskieu);
        lista.add(ilosctrasmasywslezyu);
        lista.add(ilosctrasgoryswietokrzyskieu);

        lista.add(ilosctrastatryd);
        lista.add(ilosctrastatryzachodnied);
        lista.add(ilosctraspieninyd);
        lista.add(ilosctrasbeskidslaskid);
        lista.add(ilosctrasbeskidmalyd);
        lista.add(ilosctrasbeskidzywieckid);
        lista.add(ilosctrasgorced);
        lista.add(ilosctrasbeskidsadeckid);
        lista.add(ilosctrasbeskidniskid);
        lista.add(ilosctrasbeskidmakowskid);
        lista.add(ilosctrasbeskidwyspowyd);
        lista.add(ilosctrasbieszczadyd);
        lista.add(ilosctrasgorysanockoturczanskied);
        lista.add(ilosctrasgoryizerskied);
        lista.add(ilosctraskarkonoszed);
        lista.add(ilosctrasgorykaczawskied);
        lista.add(ilosctrasrudawyjanowickied);
        lista.add(ilosctrasgorywalbrzyskied);
        lista.add(ilosctrasgorykamienned);
        lista.add(ilosctrasgoryjastrzebied);
        lista.add(ilosctrasgorystolowed);
        lista.add(ilosctrasgoryorlickieibystrzyckied);
        lista.add(ilosctrasgorysowied);
        lista.add(ilosctrasgorybardzkied);
        lista.add(ilosctrasgoryzloteibialskied);
        lista.add(ilosctrasmasywsnieznikad);
        lista.add(ilosctrasgoryopawskied);
        lista.add(ilosctrasmasywslezyd);
        lista.add(ilosctrasgoryswietokrzyskied);


        lista.add(ilosctrastatryc);
        lista.add(ilosctrastatryzachodniec);
        lista.add(ilosctraspieninyc);
        lista.add(ilosctrasbeskidslaskic);
        lista.add(ilosctrasbeskidmalyc);
        lista.add(ilosctrasbeskidzywieckic);
        lista.add(ilosctrasgorcec);
        lista.add(ilosctrasbeskidsadeckic);
        lista.add(ilosctrasbeskidniskic);
        lista.add(ilosctrasbeskidmakowskic);
        lista.add(ilosctrasbeskidwyspowyc);
        lista.add(ilosctrasbieszczadyc);
        lista.add(ilosctrasgorysanockoturczanskiec);
        lista.add(ilosctrasgoryizerskiec);
        lista.add(ilosctraskarkonoszec);
        lista.add(ilosctrasgorykaczawskiec);
        lista.add(ilosctrasrudawyjanowickiec);
        lista.add(ilosctrasgorywalbrzyskiec);
        lista.add(ilosctrasgorykamiennec);
        lista.add(ilosctrasgoryjastrzebiec);
        lista.add(ilosctrasgorystolowec);
        lista.add(ilosctrasgoryorlickieibystrzyckiec);
        lista.add(ilosctrasgorysowiec);
        lista.add(ilosctrasgorybardzkiec);
        lista.add(ilosctrasgoryzloteibialskiec);
        lista.add(ilosctrasmasywsnieznikac);
        lista.add(ilosctrasgoryopawskiec);
        lista.add(ilosctrasmasywslezyc);
        lista.add(ilosctrasgoryswietokrzyskiec);

        return ResponseEntity.ok(lista);
    }



    @PostMapping("/create")
    public ResponseEntity addMountain(Mountain mountain) {

        try{
            return addMountain1(mountain);
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Złe zapytanie");
        }

    }

    public ResponseEntity<Object> addMountain1(Mountain mountain) {

        checkTop(mountain);
        checkDescription(mountain);

        List<Integer> allMountainId = mountainRepository.findAllMountainId();
        Integer id = allMountainId.get(allMountainId.size() - 1) + 1;

        Pattern p = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        p.matcher(mountain.getTime().toString()).matches();

        if (p.matcher(mountain.getTime().toString()).matches() && mountain.getTop() != null && mountain.getTop() > 0  && mountain.getDistance() !=null && mountain.getDistance()  > 0 ) {
            mountainRepository.createOneMountain(id, mountain.getDescription(), mountain.getTime(), mountain.getMountainRange(), mountain.getTopMountain(), mountain.getTop(), mountain.getDistance(), mountain.getPdf());
            return ResponseEntity.ok().build();
        } else {
            throw new RuntimeException();
        }
    }

    public void checkDescription(Mountain mountain){
        assertTrue("Nie dodałeś opisu",mountain.getDescription()!="");
    }

    public void checkTop (Mountain mountain){
        assertTrue("Nie dodałeś szczytu",mountain.getTopMountain()!="");
    }



    @PostMapping("/update")
    public ResponseEntity updateMountain(Mountain mountain) {

        try{
            return updateMountain1(mountain);
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Złe zapytanie");
        }
    }

    public ResponseEntity<Object> updateMountain1(Mountain mountain) {

        Pattern p = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        p.matcher(mountain.getTime().toString()).matches();

        if (p.matcher(mountain.getTime().toString()).matches() && mountain.getTop() != null && mountain.getTop() > 0  && mountain.getDistance() !=null && mountain.getDistance()  > 0 ) {
            mountainRepository.updateMountain(mountain.getIdmountain(),mountain.getDescription(),mountain.getTime(),mountain.getMountainRange(),mountain.getTopMountain(),mountain.getTop(),mountain.getDistance(),mountain.getPdf());
            return ResponseEntity.ok().build();

        } else {
            throw new RuntimeException();
        }
    }


    @PostMapping("/delete")
    public ResponseEntity deleteMountain(Mountain mountain) {

        mountainRepository.deleteOneMountain(mountain.getIdmountain());

        return ResponseEntity.ok().build();
    }




}

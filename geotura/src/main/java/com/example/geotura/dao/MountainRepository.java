package com.example.geotura.dao;

import com.example.geotura.model.Mountain;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Time;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface MountainRepository extends CrudRepository<Mountain, Integer> {

    @Query(
            value = "SELECT * FROM mountain",
            nativeQuery = true)
    List<Mountain> findAllMountain();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Tatry Wysokie'",
            nativeQuery = true)
    Integer findilosctrastatry();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Pieniny'",
            nativeQuery = true)
    Integer findilosctraspieniny();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Śląski'",
            nativeQuery = true)
    Integer findilosctrasbeskidslaski();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Mały'",
            nativeQuery = true)
    Integer findilosctrasbeskidmaly();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Żywiecki'",
            nativeQuery = true)
    Integer findilosctrasbeskidzywiecki();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Gorce'",
            nativeQuery = true)
    Integer findilosctrasgorce();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Sądecki'",
            nativeQuery = true)
    Integer findilosctrasbeskidsadecki();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Niski'",
            nativeQuery = true)
    Integer findilosctrasbeskidniski();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Bieszczady'",
            nativeQuery = true)
    Integer findilosctrasbieszczady();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Makowski'",
            nativeQuery = true)
    Integer findilosctrasbeskidmakowski();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Beskid Wyspowy'",
            nativeQuery = true)
    Integer findilosctrasbeskidwyspowy();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Tatry Zachodnie'",
            nativeQuery = true)
    Integer findilosctrastatryzachodnie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Sanocko-Turczańskie'",
            nativeQuery = true)
    Integer findilosctrasgorysanockoturczanskie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Izerskie'",
            nativeQuery = true)
    Integer findilosctrasgoryizerskie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Karkonosze'",
            nativeQuery = true)
    Integer findilosctraskarkonosze();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Kaczawskie'",
            nativeQuery = true)
    Integer findilosctrasgorykaczawskie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Rudawy Janowickie'",
            nativeQuery = true)
    Integer findilosctrasrudawyjanowickie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Wałbrzyskie'",
            nativeQuery = true)
    Integer findilosctrasgorywalbrzyskie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Kamienne'",
            nativeQuery = true)
    Integer findilosctrasgorykamienne();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Jastrzębie'",
            nativeQuery = true)
    Integer findilosctrasgoryjastrzebie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Stołowe'",
            nativeQuery = true)
    Integer findilosctrasgorystolowe();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Orlickie i Bystrzyckie'",
            nativeQuery = true)
    Integer findilosctrasgoryorlickieibystrzyckie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Sowie'",
            nativeQuery = true)
    Integer findilosctrasgorysowie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Bardzkie'",
            nativeQuery = true)
    Integer findilosctrasgorybardzkie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Złote i Bialskie'",
            nativeQuery = true)
    Integer findilosctrasgoryzloteibialskie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Masyw Śnieżnika'",
            nativeQuery = true)
    Integer findilosctrasmasywsnieznika();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Opawskie'",
            nativeQuery = true)
    Integer findilosctrasgoryopawskie();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Masyw Ślęży'",
            nativeQuery = true)
    Integer findilosctrasmasywslezy();

    @Query(
            value = "SELECT COUNT(id) from mountain WHERE mountain_range = 'Góry Świętokrzyskie'",
            nativeQuery = true)
    Integer findilosctrasgoryswietokrzyskie();


    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry' ",
            nativeQuery = true)
    Integer findilosctrastatryz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Pieniny' ",
            nativeQuery = true)
    Integer findilosctraspieninyz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Śląski' ",
            nativeQuery = true)
    Integer findilosctrasbeskidslaskiz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Mały' ",
            nativeQuery = true)
    Integer findilosctrasbeskidmalyz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Żywiecki' ",
            nativeQuery = true)
    Integer findilosctrasbeskidzywieckiz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Gorce' ",
            nativeQuery = true)
    Integer findilosctrasgorcez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Sądecki' ",
            nativeQuery = true)
    Integer findilosctrasbeskidsadeckiz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Niski' ",
            nativeQuery = true)
    Integer findilosctrasbeskidniskiz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Bieszczady' ",
            nativeQuery = true)
    Integer findilosctrasbieszczadyz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Makowski' ",
            nativeQuery = true)
    Integer findilosctrasbeskidmakowskiz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Wyspowy' ",
            nativeQuery = true)
    Integer findilosctrasbeskidwyspowyz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry Zachodnie' ",
            nativeQuery = true)
    Integer findilosctrastatryzachodniez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sanocko-Turczańskie' ",
            nativeQuery = true)
    Integer findilosctrasgorysanockoturczanskiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Izerskie' ",
            nativeQuery = true)
    Integer findilosctrasgoryizerskiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Karkonosze' ",
            nativeQuery = true)
    Integer findilosctraskarkonoszez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kaczawskie' ",
            nativeQuery = true)
    Integer findilosctrasgorykaczawskiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Rudawy Janowickie' ",
            nativeQuery = true)
    Integer findilosctrasrudawyjanowickiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Wałbrzyskie' ",
            nativeQuery = true)
    Integer findilosctrasgorywalbrzyskiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kamienne' ",
            nativeQuery = true)
    Integer findilosctrasgorykamiennez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Jastrzębie' ",
            nativeQuery = true)
    Integer findilosctrasgoryjastrzebiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Stołowe' ",
            nativeQuery = true)
    Integer findilosctrasgorystolowez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Orlickie i Bystrzyckie' ",
            nativeQuery = true)
    Integer findilosctrasgoryorlickieibystrzyckiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sowie' ",
            nativeQuery = true)
    Integer findilosctrasgorysowiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Bardzkie' ",
            nativeQuery = true)
    Integer findilosctrasgorybardzkiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Złote i Bialskie' ",
            nativeQuery = true)
    Integer findilosctrasgoryzloteibialskiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Śnieżnika' ",
            nativeQuery = true)
    Integer findilosctrasmasywsnieznikaz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Opawskie' ",
            nativeQuery = true)
    Integer findilosctrasgoryopawskiez(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Ślęży' ",
            nativeQuery = true)
    Integer findilosctrasmasywslezyz(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Świętokrzyskie' ",
            nativeQuery = true)
    Integer findilosctrasgoryswietokrzyskiez(Integer iduser);



    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Integer findilosctrastatryu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Pieniny' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Integer findilosctraspieninyu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Śląski' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasbeskidslaskiu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Mały' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasbeskidmalyu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Żywiecki' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Integer findilosctrasbeskidzywieckiu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Gorce' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgorceu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Sądecki' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasbeskidsadeckiu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Niski' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasbeskidniskiu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Bieszczady' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasbieszczadyu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Makowski' AND NOT e.end_date = 'null'  ",
            nativeQuery = true)
    Integer findilosctrasbeskidmakowskiu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Wyspowy' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasbeskidwyspowyu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry Zachodnie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrastatryzachodnieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sanocko-Turczańskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgorysanockoturczanskieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Izerskie' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgoryizerskieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Karkonosze'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctraskarkonoszeu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kaczawskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgorykaczawskieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Rudawy Janowickie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasrudawyjanowickieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Wałbrzyskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgorywalbrzyskieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kamienne' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Integer findilosctrasgorykamienneu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Jastrzębie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgoryjastrzebieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Stołowe'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgorystoloweu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Orlickie i Bystrzyckie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgoryorlickieibystrzyckieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sowie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgorysowieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Bardzkie' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Integer findilosctrasgorybardzkieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Złote i Bialskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgoryzloteibialskieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Śnieżnika'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasmasywsnieznikau(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Opawskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgoryopawskieu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Ślęży'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasmasywslezyu(Integer iduser);

    @Query(
            value = "SELECT COUNT(e.id) FROM date_activity e inner join mountain g on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Świętokrzyskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Integer findilosctrasgoryswietokrzyskieu(Integer iduser);









    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Float findilosctrastatryd(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Pieniny' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Float findilosctraspieninyd(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Śląski' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasbeskidslaskid(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Mały' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasbeskidmalyd(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Żywiecki' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Float findilosctrasbeskidzywieckid(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Gorce' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgorced(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Sądecki' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasbeskidsadeckid(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance)FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Niski' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasbeskidniskid(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Bieszczady' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasbieszczadyd(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Makowski' AND NOT e.end_date = 'null'  ",
            nativeQuery = true)
    Float findilosctrasbeskidmakowskid(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Wyspowy' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasbeskidwyspowyd(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry Zachodnie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrastatryzachodnied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sanocko-Turczańskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgorysanockoturczanskied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Izerskie' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgoryizerskied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Karkonosze'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctraskarkonoszed(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kaczawskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgorykaczawskied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Rudawy Janowickie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasrudawyjanowickied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Wałbrzyskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgorywalbrzyskied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kamienne' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Float findilosctrasgorykamienned(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Jastrzębie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgoryjastrzebied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Stołowe'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgorystolowed(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Orlickie i Bystrzyckie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgoryorlickieibystrzyckied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sowie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgorysowied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Bardzkie' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Float findilosctrasgorybardzkied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Złote i Bialskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgoryzloteibialskied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Śnieżnika'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasmasywsnieznikad(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Opawskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgoryopawskied(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Ślęży'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasmasywslezyd(Integer iduser);

    @Query(
            value = "SELECT SUM(g.distance) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Świętokrzyskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Float findilosctrasgoryswietokrzyskied(Integer iduser);











    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Date findilosctrastatryc(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Pieniny' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Date findilosctraspieninyc(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Śląski' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasbeskidslaskic(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Mały' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasbeskidmalyc(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Żywiecki' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Date findilosctrasbeskidzywieckic(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Gorce' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgorcec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Sądecki' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasbeskidsadeckic(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time)))FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Niski' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasbeskidniskic(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Bieszczady' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasbieszczadyc(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Makowski' AND NOT e.end_date = 'null'  ",
            nativeQuery = true)
    Date findilosctrasbeskidmakowskic(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Beskid Wyspowy' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasbeskidwyspowyc(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Tatry Zachodnie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrastatryzachodniec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sanocko-Turczańskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgorysanockoturczanskiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Izerskie' AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgoryizerskiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Karkonosze'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctraskarkonoszec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kaczawskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgorykaczawskiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Rudawy Janowickie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasrudawyjanowickiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Wałbrzyskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgorywalbrzyskiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Kamienne' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Date findilosctrasgorykamiennec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Jastrzębie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgoryjastrzebiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Stołowe'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgorystolowec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Orlickie i Bystrzyckie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgoryorlickieibystrzyckiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Sowie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgorysowiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Bardzkie' AND NOT e.end_date = 'null'",
            nativeQuery = true)
    Date findilosctrasgorybardzkiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Złote i Bialskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgoryzloteibialskiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Śnieżnika'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasmasywsnieznikac(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Opawskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgoryopawskiec(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Masyw Ślęży'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasmasywslezyc(Integer iduser);

    @Query(
            value = "SELECT SEC_TO_TIME(SUM(TIME_TO_SEC(g.time))) FROM mountain g inner join date_activity e on e.id_mountain = g.id WHERE e.id_user=?1 AND g.mountain_range = 'Góry Świętokrzyskie'AND NOT e.end_date = 'null' ",
            nativeQuery = true)
    Date findilosctrasgoryswietokrzyskiec(Integer iduser);





    @Query(
            value = "SELECT id FROM mountain order by id",
            nativeQuery = true)
    List<Integer> findAllMountainId();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO mountain VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)",
            nativeQuery = true)
    void createOneMountain(Integer id, String opis, Time czas, String range, String topm, Integer top, Float distance, String pdf);

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE mountain u SET u.description = ?2, u.time =?3, u.mountain_range =?4, u.top_mountain =?5, u.top =?6, u.distance=?7, u.pdf=?8 WHERE u.id = ?1",
            nativeQuery = true)
    void updateMountain(Integer id, String opis, Time czas, String range, String topm, Integer top, Float distance, String pdf);

    @Modifying
    @Transactional
    @Query(
            value = "DELETE FROM mountain WHERE id = ?1",
            nativeQuery = true)
    void deleteOneMountain(Integer id);

}

package com.example.geotura.dao;

import com.example.geotura.model.DateActivityPhotoMountain;
import com.example.geotura.model.Email;
import com.example.geotura.model.EmailUser;
import com.example.geotura.model.Mountain;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmailRepository extends CrudRepository<Email, Integer> {

    @Query(
            value = "SELECT id FROM email order by id",
            nativeQuery = true)
    List<Integer> findAllEmailId();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO email VALUES(?1, ?2, ?3, ?4, ?5)",
            nativeQuery = true)
    void createOneEmail(Integer id, Integer idr, Integer ids, String text, LocalDate date);


    @Query(
            value = "SELECT new com.example.geotura.model.EmailUser(e.idemail, e.idreceiver, e.idsender, e.text, e.dateSend, s.iduser, s.createDate, s.email, s.firstName, s.lastName, s.password)  FROM Email e left join User s on s.iduser = e.idsender WHERE e.idreceiver =?1")
    List<EmailUser> findAllEmailIds(Integer id);



    @Modifying
    @Transactional
    @Query(
            value = "DELETE FROM email WHERE id = ?1",
            nativeQuery = true)
    void deleteOneEmail(Integer id);





}

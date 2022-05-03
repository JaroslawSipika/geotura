package com.example.geotura.dao;

import com.example.geotura.model.Client;
import com.example.geotura.model.DateActivityMountain;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {

    @Query(
            value = "SELECT id FROM client order by id",
            nativeQuery = true)
    List<Integer> findAllClientId();

    @Query(
            value = "SELECT id_user FROM client",
            nativeQuery = true)
    List<Integer> findAllClientUserIdIds();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO client VALUES(?1, ?2)",
            nativeQuery = true)
    void registrationOneClient(Integer idClient, Integer idUser);


}

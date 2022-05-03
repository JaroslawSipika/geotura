package com.example.geotura.dao;

import com.example.geotura.model.Admin;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

    @Query(
            value = "SELECT id_user FROM admin order by id",
            nativeQuery = true)
    List<Integer> findAllAdminUserIdIds();


    @Query(
            value = "SELECT id FROM admin order by id",
            nativeQuery = true)
    List<Integer> findAllAdminId();

    @Query(
            value = "SELECT COUNT(id) FROM admin",
            nativeQuery = true)
    Integer findAllAdminIdInteger();



    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO admin VALUES(?1, ?2)",
            nativeQuery = true)
    void createAdmin(Integer id, Integer iduser);

}

package com.example.geotura.dao;

import com.example.geotura.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


    @Query(
            value = "SELECT id FROM user order by id",
            nativeQuery = true)
    List<Integer> findAllUserId();


    @Query(
            value = "SELECT * FROM user u WHERE u.email = ?1",
            nativeQuery = true)
    User getUserByEmail(String email);


    @Query(
            value = "SELECT first_name FROM user u WHERE u.id = ?1",
            nativeQuery = true)
    String getUserNameById(Integer iduser);


    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO user VALUES(?1, ?2, ?3 , ?4, ?5, ?6)",
            nativeQuery = true)
    void registrationOneUser(Integer iduser, LocalDate createDate, String email, String firstName, String lastName, String password);


    @Query(
            value = "SELECT * FROM user WHERE not id = ?1",
            nativeQuery = true)
    List<User> findAllUser(Integer id);

    @Query(
            value = "SELECT * FROM user WHERE id = ?1",
            nativeQuery = true)
    List<User> findAllUser1(Integer id);

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE user u SET u.email = ?2, u.first_name =?3, u.last_name =?4, u.password =?5 WHERE u.id = ?1",
            nativeQuery = true)
    void updateUser(Integer iduser, String email, String firstname, String lastname, String password);

    @Modifying
    @Transactional
    @Query(
            value = "DELETE FROM user WHERE id = ?1",
            nativeQuery = true)
    void deleteUser(Integer id, String name);

    @Query(
            value = "SELECT * FROM user",
            nativeQuery = true)
    List<User> findAllUsers1();

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE user u SET u.email = ?2, u.first_name =?3, u.last_name =?4, u.password =?5 WHERE u.id = ?1",
            nativeQuery = true)
    void updateUser1(Integer iduser, String email, String firstname, String lastname, String password);


    @Modifying
    @Transactional
    @Query(
            value = "DELETE FROM user WHERE id = ?1",
            nativeQuery = true)
    void deleteUser1(Integer id, String name);

    @Query(
            value = "SELECT CASE WHEN EXISTS(SELECT * FROM user u WHERE u.email = ?1)THEN 'TRUE' ELSE 'FALSE' END",
            nativeQuery = true)
    boolean getUserByEmailBoolean(String email);


}

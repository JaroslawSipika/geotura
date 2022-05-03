package com.example.geotura.dao;

import com.example.geotura.model.DateActivity;
import com.example.geotura.model.DateActivityMountain;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface DateActivityRepository extends CrudRepository<DateActivity, Integer> {

    @Query(
            value = "SELECT new com.example.geotura.model.DateActivityMountain(e.iddateactivity, e.createDate, e.endDate, e.userId, e.mountainId, g.idmountain, g.description, g.time, g.mountainRange, g.topMountain, g.top, g.distance, g.pdf)  FROM DateActivity e left join Mountain g on e.mountainId = g.idmountain WHERE e.userId =?1")
    List<DateActivityMountain> findAllDateActivityById(Integer id);

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE date_activity u SET u.end_date = ?2 WHERE u.id_user = ?1 and u.id = ?3",
            nativeQuery = true)
    void updateDateActivityByIdUser(Integer iduser, LocalDate date,Integer iddateactivity);

    @Query(
            value = "SELECT id FROM date_activity order by id",
            nativeQuery = true)
    List<Integer> findAllDateActivityId();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO date_activity VALUES(?1, ?2, ?3, ?4, ?5)",
            nativeQuery = true)
    void createOneDateActivity(Integer id, LocalDate createDate, LocalDate endDate, Integer iduser, Integer idmountain);




    @Query(
            value = "SELECT COUNT(end_date) from date_activity WHERE id_user = ?1",
            nativeQuery = true)
    Integer findNumberOfRowsById(Integer iduser);

    @Query(
            value = "SELECT SUM(e.distance) FROM mountain e inner join date_activity g on g.id_mountain = e.id WHERE g.id_user=?1 AND NOT g.end_date = 'null' ",
            nativeQuery = true)
    Float findSumKilometers(Integer iduser);

    @Query(
            value = "SELECT MAX(e.top) FROM mountain e inner join date_activity g on g.id_mountain = e.id WHERE g.id_user=?1 AND NOT g.end_date = 'null'",
            nativeQuery = true)
    Float findBiggest(Integer iduser);

    @Query(
            value = "SELECT MAX(e.distance) FROM mountain e inner join date_activity g on g.id_mountain = e.id WHERE g.id_user=?1 AND NOT g.end_date = 'null'",
            nativeQuery = true)
    Float findLongest(Integer iduser);

    @Modifying
    @Transactional
    @Query(
            value = "DELETE FROM date_activity WHERE id = ?1",
            nativeQuery = true)
    void deleteDateActivity(Integer id);




}

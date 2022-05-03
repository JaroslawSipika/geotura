package com.example.geotura.dao;

import com.example.geotura.model.DateActivityMountain;
import com.example.geotura.model.DateActivityPhotoMountain;
import com.example.geotura.model.Photo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Integer> {


    @Query(
            value = "SELECT new com.example.geotura.model.DateActivityPhotoMountain(e.iddateactivity, e.createDate, e.endDate, e.userId, e.mountainId, s.idphoto, s.link, s.dateActivityId, g.idmountain, g.description, g.time, g.mountainRange, g.topMountain, g.top, g.distance, g.pdf)  FROM Photo s left join DateActivity e on s.dateActivityId = e.iddateactivity left join Mountain g on e.mountainId = g.idmountain  WHERE e.userId =?1")
    List<DateActivityPhotoMountain> findAllPhotoById(Integer id);

    @Query(
            value = "SELECT new com.example.geotura.model.DateActivityPhotoMountain(e.iddateactivity, e.createDate, e.endDate, e.userId, e.mountainId, s.idphoto, s.link, s.dateActivityId, g.idmountain, g.description, g.time, g.mountainRange, g.topMountain, g.top, g.distance, g.pdf)  FROM DateActivity e left join Photo s on s.dateActivityId = e.iddateactivity left join Mountain g on e.mountainId = g.idmountain  WHERE e.userId =?1")
    List<DateActivityPhotoMountain> findAllPhotoById1(Integer id);

    @Query(
            value = "SELECT new com.example.geotura.model.DateActivityPhotoMountain(e.iddateactivity, e.createDate, e.endDate, e.userId, e.mountainId, s.idphoto, s.link, s.dateActivityId, g.idmountain, g.description, g.time, g.mountainRange, g.topMountain, g.top, g.distance, g.pdf)  FROM DateActivity e left join Photo s on s.dateActivityId = e.iddateactivity left join Mountain g on e.mountainId = g.idmountain  WHERE e.userId =?1 GROUP BY e.iddateactivity")
    List<DateActivityPhotoMountain> findAllPhotoById2(Integer id);




    @Query(
            value = "SELECT id FROM photo order by id",
            nativeQuery = true)
    List<Integer> findAllPhotoId();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO photo VALUES(?1, ?2, ?3)",
            nativeQuery = true)
    void createOnePhoto(Integer iduser, String link, Integer iddateactivity);

}

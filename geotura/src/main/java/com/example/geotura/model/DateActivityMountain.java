package com.example.geotura.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;
import java.sql.Time;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
public class DateActivityMountain {
    @Column(name ="id")
    private Integer iddateactivity;
    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column (name = "id_user")
    private Integer userId;
    @Column (name = "id_mountain")
    private Integer mountainId;
    @Column(name ="id")
    private Integer idmountain;
    @Column(name = "description")
    private String description;
    @Column(name = "time")
    private Date time;
    @Column(name = "mountain_range")
    private String mountainRange;
    @Column(name = "top_mountain")
    private String topMountain;
    @Column(name = "top")
    private Integer top;
    @Column(name = "distance")
    private Float distance;
    @Column(name = "pdf")
    private String pdf;


    public DateActivityMountain(Integer iddateactivity, LocalDate createDate, LocalDate endDate, Integer userId, Integer mountainId, Integer idmountain, String description, Date time, String mountainRange, String topMountain, Integer top, Float distance, String pdf) {
        this.iddateactivity = iddateactivity;
        this.createDate = createDate;
        this.endDate = endDate;
        this.userId = userId;
        this.mountainId = mountainId;
        this.idmountain = idmountain;
        this.description = description;
        this.time = time;
        this.mountainRange = mountainRange;
        this.topMountain = topMountain;
        this.top = top;
        this.distance = distance;
        this.pdf = pdf;
    }
}

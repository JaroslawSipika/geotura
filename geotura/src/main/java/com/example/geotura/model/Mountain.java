package com.example.geotura.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "mountain")
public class Mountain {

    @Id
    @Column(name ="id")
    private Integer idmountain;
    @Column(name = "description")
    private String description;
    @Column(name = "time")
    private Time time;
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

}

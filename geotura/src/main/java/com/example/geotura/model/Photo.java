package com.example.geotura.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "photo")
public class Photo {

    @Id
    @Column(name ="id")
    private Integer idphoto;
    @Column(name = "link")
    private String link;
    @Column (name = "id_date_activity")
    private Integer dateActivityId;
}

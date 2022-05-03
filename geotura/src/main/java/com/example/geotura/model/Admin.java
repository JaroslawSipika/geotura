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
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name ="id")
    private Integer id;
    @Column(name = "id_user")
    private Integer userId;


}

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
@Table(name = "client")
public class Client {

    @Id
    @Column(name ="id")
    private Integer idclient;
    @Column(name = "id_user")
    private Integer idUser;


}

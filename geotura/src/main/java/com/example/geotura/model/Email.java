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
@Table(name = "email")
public class Email {

    @Id
    @Column(name ="id")
    private Integer idemail;
    @Column(name ="receiver")
    private Integer idreceiver;
    @Column(name ="sender")
    private Integer idsender;
    @Column(name ="text")
    private String text;
    @Column(name ="date_send")
    private String dateSend;
}

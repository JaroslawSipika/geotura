package com.example.geotura.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class EmailUser {

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
    @Column(name = "id")
    private Integer iduser;
    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "email")
    private String email;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "password")
    private String password;

    public EmailUser(Integer idemail, Integer idreceiver, Integer idsender, String text, String dateSend, Integer iduser, LocalDate createDate, String email, String firstName, String lastName, String password) {
        this.idemail = idemail;
        this.idreceiver = idreceiver;
        this.idsender = idsender;
        this.text = text;
        this.dateSend = dateSend;
        this.iduser = iduser;
        this.createDate = createDate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}

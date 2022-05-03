package com.example.geotura.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "date_activity")
public class DateActivity {

    @Id
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

}

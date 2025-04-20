package com.workintech.sqlintro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ogrenci")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ogrenci {
    @Id
    @Column(name = "ogrno")
    private Long ogrno;

    private String ad;
    private String soyad;
    private String cinsiyet;
    private String sinif;
    private int puan;

    @Column(nullable = true)
    private String dtarih;
}


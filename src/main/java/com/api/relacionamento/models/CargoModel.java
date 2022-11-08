package com.api.relacionamento.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "TB_CARGO")
public class CargoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String nome;

}

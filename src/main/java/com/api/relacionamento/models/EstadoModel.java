package com.api.relacionamento.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ESTADOS")
public class EstadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 2, unique = true)
    private String sigla;
}

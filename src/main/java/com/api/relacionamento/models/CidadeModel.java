package com.api.relacionamento.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_CIDADE")
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

}

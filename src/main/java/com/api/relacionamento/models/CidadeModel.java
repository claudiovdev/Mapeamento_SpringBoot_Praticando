package com.api.relacionamento.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TB_CIDADE")
public class CidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "ESTADO")
   private  EstadoModel estado;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade")
    private List<PessoaModel> pessoas;
}

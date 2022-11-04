package com.api.relacionamento.services;

import com.api.relacionamento.models.PessoaModel;

import java.util.List;

public interface PessoaService {
    PessoaModel salvar(PessoaModel pessoaModel);

    List<PessoaModel> listar();
}

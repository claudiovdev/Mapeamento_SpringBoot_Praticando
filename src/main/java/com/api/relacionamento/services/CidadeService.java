package com.api.relacionamento.services;

import com.api.relacionamento.models.CidadeModel;

import java.util.List;

public interface CidadeService {
    CidadeModel salvar(CidadeModel cidadeModel);

    List<CidadeModel> listar();
}

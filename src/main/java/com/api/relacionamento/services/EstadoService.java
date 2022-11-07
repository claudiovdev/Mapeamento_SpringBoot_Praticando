package com.api.relacionamento.services;

import com.api.relacionamento.models.EstadoModel;

import java.util.List;

public interface EstadoService {

    EstadoModel salvar(EstadoModel estado);

    List<EstadoModel> listar();
}

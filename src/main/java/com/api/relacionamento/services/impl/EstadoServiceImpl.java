package com.api.relacionamento.services.impl;

import com.api.relacionamento.models.EstadoModel;
import com.api.relacionamento.repositories.EstadoRepository;
import com.api.relacionamento.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    EstadoRepository repository;

    @Override
    public EstadoModel salvar(EstadoModel estado) {
        return repository.save(estado);
    }

    @Override
    public List<EstadoModel> listar() {
        return repository.findAll();
    }
}

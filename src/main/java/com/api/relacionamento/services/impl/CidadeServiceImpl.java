package com.api.relacionamento.services.impl;

import com.api.relacionamento.models.CidadeModel;
import com.api.relacionamento.repositories.CidadeReposutory;
import com.api.relacionamento.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    CidadeReposutory reposutory;

    @Override
    public CidadeModel salvar(CidadeModel cidadeModel) {
        return reposutory.save(cidadeModel);
    }

    @Override
    public List<CidadeModel> listar() {
        return reposutory.findAll();
    }
}

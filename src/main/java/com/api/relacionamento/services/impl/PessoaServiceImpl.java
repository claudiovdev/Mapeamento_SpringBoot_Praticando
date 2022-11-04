package com.api.relacionamento.services.impl;

import com.api.relacionamento.enums.PessoaStatus;
import com.api.relacionamento.models.PessoaModel;
import com.api.relacionamento.repositories.PessoaRepository;
import com.api.relacionamento.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {
    @Autowired
    PessoaRepository repository;

    @Override
    public PessoaModel salvar(PessoaModel pessoaModel) {
        pessoaModel.setPessoaStatus(PessoaStatus.ATIVO);
        pessoaModel.setDataCriacao(LocalDateTime.now());
        pessoaModel.setDataAtualizacao(LocalDateTime.now());
        return repository.save(pessoaModel);
    }

    @Override
    public List<PessoaModel> listar() {
        return repository.findAll();
    }
}

package com.api.relacionamento.repositories;

import com.api.relacionamento.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaRepository extends JpaRepository<PessoaModel, UUID> {
}

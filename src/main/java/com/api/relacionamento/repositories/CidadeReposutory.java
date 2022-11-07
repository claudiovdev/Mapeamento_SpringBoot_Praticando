package com.api.relacionamento.repositories;

import com.api.relacionamento.models.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeReposutory extends JpaRepository<CidadeModel, Long> {
}

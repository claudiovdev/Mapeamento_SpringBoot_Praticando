package com.api.relacionamento.repositories;

import com.api.relacionamento.models.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<EstadoModel, Long> {
}

package com.api.relacionamento.controllers;

import com.api.relacionamento.models.EstadoModel;
import com.api.relacionamento.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    EstadoService service;

    @PostMapping
    public ResponseEntity<EstadoModel> cadastrarEstado(@RequestBody EstadoModel estadoModel){
            EstadoModel estado = service.salvar(estadoModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(estado);
    }

    @GetMapping
    public ResponseEntity<List<EstadoModel>> listarEstados(){
        List<EstadoModel> estados = service.listar();
       return  ResponseEntity.ok().body(estados);
    }
}

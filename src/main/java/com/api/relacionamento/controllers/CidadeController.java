package com.api.relacionamento.controllers;

import com.api.relacionamento.models.CidadeModel;
import com.api.relacionamento.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    CidadeService service;

    @PostMapping
    public ResponseEntity<CidadeModel> cadastrarCidade(@RequestBody CidadeModel cidadeModel ){
        CidadeModel cidade = service.salvar(cidadeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cidade);
    }

    @GetMapping
    public ResponseEntity<List<CidadeModel>> listarCidades(){
        List<CidadeModel> cidades =  service.listar();
        return ResponseEntity.ok().body(cidades);
    }
}

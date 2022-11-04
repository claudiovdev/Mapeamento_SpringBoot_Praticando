package com.api.relacionamento.controllers;

import com.api.relacionamento.models.PessoaModel;
import com.api.relacionamento.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<PessoaModel> cadastrarPessoa(@RequestBody PessoaModel pessoaModel){
        service.salvar(pessoaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaModel);
    }

    @GetMapping
    public ResponseEntity<List<PessoaModel>> listarPessoas(){
       List<PessoaModel> pessoas =  service.listar();
        return ResponseEntity.ok().body(pessoas);
    }
}

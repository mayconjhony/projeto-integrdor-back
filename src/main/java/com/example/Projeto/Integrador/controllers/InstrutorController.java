package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.service.InstrutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class InstrutorController {

    final InstrutorServiceImpl instrutorService;

    public InstrutorController(InstrutorServiceImpl instrutorServiceImpl) {
        this.instrutorService = instrutorServiceImpl;
    }
    @PostMapping("/salvarUsuario")
    public ResponseEntity<Object> salvarCurso(@RequestBody Instrutor instrutor) throws Exception {
        Instrutor response = instrutorService.salvar(instrutor);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/v2/login")
    public  ResponseEntity<Object> sessao(@RequestBody Instrutor instrutor) throws  Exception {
        Instrutor response = instrutorService.buscarInstrutorPorEmail(instrutor);
        return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.CREATED);
    }
}

package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.models.Laboratorio;
import com.example.Projeto.Integrador.service.LaboratorioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "laboratorio")
public class LaboratórioControllers {

    final LaboratorioServiceImpl laboratorioService;

    public LaboratórioControllers(LaboratorioServiceImpl laboratorioServiceImpl) {
        this.laboratorioService = laboratorioServiceImpl;
    }
    @PostMapping
    public ResponseEntity<Object> salvarLaboratorio(@RequestBody Laboratorio laboratorio) throws Exception{
        Laboratorio response = laboratorioService.salvar(laboratorio);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @DeleteMapping()
    public void deletarAgendamento(Long id) {
        laboratorioService.deletar(id);
    }

    @GetMapping
    public List<Laboratorio> findAllLaboratorio(){
        return laboratorioService.listar();
    }

    @PutMapping
    public void updateLaboratorio(@RequestBody Laboratorio laboratorio){
        laboratorioService.editar(laboratorio);
    }
}

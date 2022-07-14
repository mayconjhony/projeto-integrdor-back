package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.service.AgendamentoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "agendamento")

public class AgendamentoControllers {
    final AgendamentoServiceImpl agendamentoService;

    public AgendamentoControllers(AgendamentoServiceImpl agendamentoServiceImpl) {
        this.agendamentoService = agendamentoServiceImpl;
    }
    @PostMapping
    public ResponseEntity<Object> salvarAgendamento(@RequestBody Agendamento agendamento) throws Exception {
        Agendamento response = agendamentoService.salvar(agendamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @DeleteMapping()
    public void deletarAgendamento(Long id) {
        agendamentoService.deletar(id);
    }

    @GetMapping
    public ResponseEntity<Object> buscarAgendamento(){
        List<Agendamento> response = agendamentoService.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    public void updateAgendamento(@RequestBody Agendamento agendamento){
        agendamentoService.editar(agendamento);
    }
}

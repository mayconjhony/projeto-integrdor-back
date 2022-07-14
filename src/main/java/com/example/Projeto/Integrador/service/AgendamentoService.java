package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;

import java.util.List;

public interface AgendamentoService {

    Agendamento salvar(Agendamento agendamento) throws Exception;

    Agendamento editar(Agendamento agendamento);

    List<Agendamento> listar();

    void deletar (Long id);

}

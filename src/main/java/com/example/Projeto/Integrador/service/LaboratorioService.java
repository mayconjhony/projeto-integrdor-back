package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Laboratorio;

import java.util.List;

public interface LaboratorioService {


    Laboratorio salvar(Laboratorio laboratorio) throws Exception;

    Laboratorio editar(Laboratorio laboratorio);

    List<Laboratorio> listar();

    void deletar (Long id);

}

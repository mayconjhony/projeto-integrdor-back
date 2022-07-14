package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Instrutor;

import java.util.List;

public interface InstrutorService {


    Instrutor salvar(Instrutor instrutor) throws Exception;

    Instrutor editar(Instrutor instrutor);

    List<Instrutor> listar();

    Instrutor buscarInstrutorPorEmail (Instrutor instrutor) throws Exception;


}

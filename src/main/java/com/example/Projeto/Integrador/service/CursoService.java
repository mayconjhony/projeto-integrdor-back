package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Curso;
import java.util.List;
public interface CursoService {
    Curso salvar(Curso curso) throws Exception;

    Curso editar(Curso curso);

    List<Curso> listar();

    void deletar (long id);
}

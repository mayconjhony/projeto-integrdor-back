package com.example.Projeto.Integrador.repositories;

import com.example.Projeto.Integrador.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {

        List<Curso> findCursoByNome(String nome);
}

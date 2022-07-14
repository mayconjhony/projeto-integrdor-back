package com.example.Projeto.Integrador.repositories;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long>  {

       List<Laboratorio> findLaboratorioByNome(String nome);

}

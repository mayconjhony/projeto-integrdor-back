package com.example.Projeto.Integrador.repositories;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    List<Agendamento> findAgendamentoByDataInicio(LocalDate Data);
    List<Agendamento> findAgendamentoByHorarioInicio(String HorarioInicio);

    List<Agendamento> findAgendamentoByHorarioFim(String horarioFim);
}

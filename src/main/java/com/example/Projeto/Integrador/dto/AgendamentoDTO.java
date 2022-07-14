package com.example.Projeto.Integrador.dto;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.models.Laboratorio;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
public class AgendamentoDTO {
    private Instrutor instrutor;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String horarioInicio;
    private String horarioFim;
    private Integer numeroLaboratorio;
    private Curso curso;
    private Laboratorio laboratorio;
}

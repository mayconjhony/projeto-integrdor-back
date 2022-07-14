package com.example.Projeto.Integrador.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Builder
@Entity
@Data
@Table(name = "Agendamento")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "10")
public class Agendamento {

    @Id
    @Column(name = "id_agendamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dataInicio")
    private LocalDate dataInicio;

    @Column(name = "dataFim")
    private LocalDate dataFim;

    @Column(name = "horarioInicio")
    private String horarioInicio;

    @Column(name = "horarioFim")
    private String horarioFim;

    @Column(name = "numeroLaboratorio")
    private Integer numeroLaboratorio;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "agendamento_instrutor", joinColumns = @JoinColumn(name = "id_instrutor"), inverseJoinColumns = @JoinColumn(name = "id_agendamento"))
    private Instrutor instrutor;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "agendamento_curso", joinColumns = @JoinColumn(name = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_agendamento"))
    private Curso curso;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "agendamento_laboratorio", joinColumns = @JoinColumn(name = "id_laboratorio"), inverseJoinColumns = @JoinColumn(name = "id_agendamento"))
    private Laboratorio laboratorio;
}

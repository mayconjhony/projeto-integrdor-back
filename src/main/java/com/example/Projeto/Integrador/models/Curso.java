package com.example.Projeto.Integrador.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Curso")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "10")
public class Curso {

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "quantidadeDeAluno")
    private int quantidadeDeAluno;

}

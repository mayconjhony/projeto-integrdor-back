package com.example.Projeto.Integrador.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Laboratorio")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "10")
public class Laboratorio {

    @Id
    @Column(name = "id_laboratorio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome")
    private String nome;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "status")
    private boolean status;

}

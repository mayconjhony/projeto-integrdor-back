package com.example.Projeto.Integrador.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LaboratorioDTO {
    private String nome;
    private String quantidade;
    private boolean status;
}

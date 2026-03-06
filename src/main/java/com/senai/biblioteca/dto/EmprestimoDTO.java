package com.senai.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoDTO {

    private long id;
    @NotBlank
    private Date dataEmprestimo;
    @NotBlank
    private Date dataDevolucao;

    public EmprestimoDTO(Date dataDevolucao, Date dataEmprestimo) {
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
    }
}

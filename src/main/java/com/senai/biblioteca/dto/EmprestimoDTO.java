package com.senai.biblioteca.dto;

import com.senai.biblioteca.entity.Usuario;
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

    public EmprestimoDTO(long id, Date dataDevolucao, Date dataEmprestimo, Usuario usuario) {
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
    }
}

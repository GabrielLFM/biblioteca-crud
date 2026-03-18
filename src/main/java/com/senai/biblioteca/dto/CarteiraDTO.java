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
public class CarteiraDTO {

    private long numeroCredencial;
    @NotBlank
    private Date dataEmissao;
    @NotBlank
    private boolean isValid;


    public CarteiraDTO(long numeroCredencial, Date dataEmissao, boolean isValid, Usuario usuario) {
        this.numeroCredencial = numeroCredencial;
        this.dataEmissao = dataEmissao;
        this.isValid = isValid;
    }
}

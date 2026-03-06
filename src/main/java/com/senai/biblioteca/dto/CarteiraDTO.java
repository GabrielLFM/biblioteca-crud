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
public class CarteiraDTO {

    private long numeroCredencial;
    @NotBlank
    private Date dataEMissao;
    @NotBlank
    private boolean isValid;




}

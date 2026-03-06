package com.senai.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;

    public UsuarioDTO(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }
}

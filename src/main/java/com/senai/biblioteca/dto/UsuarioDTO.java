package com.senai.biblioteca.dto;

import com.senai.biblioteca.entity.CarteiraBiblioteca;
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

    public UsuarioDTO(String email, String nome, long numeroCredencial, CarteiraBiblioteca carteira) {
        this.email = email;
        this.nome = nome;
    }

}

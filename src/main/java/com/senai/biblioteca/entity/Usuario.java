package com.senai.biblioteca.entity;

import com.senai.biblioteca.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String email;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private CarteiraBiblioteca carteira;

    @OneToMany(mappedBy = "usuario")
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(UsuarioDTO dto) {
    }
}

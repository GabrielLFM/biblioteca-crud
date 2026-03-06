package com.senai.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
}

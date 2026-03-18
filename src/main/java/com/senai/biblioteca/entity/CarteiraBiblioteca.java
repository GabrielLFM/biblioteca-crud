package com.senai.biblioteca.entity;

import com.senai.biblioteca.dto.CarteiraDTO;
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
public class CarteiraBiblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroCredencial;
    private Date dataEmissao;
    private boolean isValid;

    @OneToOne
    @MapsId
    private Usuario usuario;

    public CarteiraBiblioteca(CarteiraDTO carDto) {
    }
}

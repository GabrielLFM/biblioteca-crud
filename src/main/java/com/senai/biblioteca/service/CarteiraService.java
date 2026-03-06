package com.senai.biblioteca.service;

import com.senai.biblioteca.repository.CarteiraRepository;

public class CarteiraService {

    private final CarteiraRepository carteiraRepository;

    public CarteiraService(CarteiraRepository carteiraRepository) {
        this.carteiraRepository = carteiraRepository;
    }


}

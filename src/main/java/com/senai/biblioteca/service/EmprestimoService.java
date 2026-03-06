package com.senai.biblioteca.service;

import com.senai.biblioteca.repository.EmprestimoRepository;

public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }


}

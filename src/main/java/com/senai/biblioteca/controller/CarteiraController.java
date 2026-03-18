package com.senai.biblioteca.controller;

import com.senai.biblioteca.dto.CarteiraDTO;
import com.senai.biblioteca.service.CarteiraService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carteira")
public class CarteiraController {

    private final CarteiraService carteiraService;

    public CarteiraController(CarteiraService carteiraService) {
        this.carteiraService = carteiraService;
    }


    @PostMapping("/{id}")
    public CarteiraDTO criarCarteira(@PathVariable Long  id, @RequestBody CarteiraDTO dto) {
        return carteiraService.criarCarteira(id, dto);
    }
}


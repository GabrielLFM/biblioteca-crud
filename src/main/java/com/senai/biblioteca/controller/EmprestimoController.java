package com.senai.biblioteca.controller;

import com.senai.biblioteca.dto.EmprestimoDTO;
import com.senai.biblioteca.dto.UsuarioDTO;
import com.senai.biblioteca.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping("/{id}")
    public EmprestimoDTO criarEmprestimo(@PathVariable Long id , @RequestBody EmprestimoDTO dto){

        return emprestimoService.criarEmprestimo(id, dto);
    }

    @GetMapping("/{id}")
    public List<EmprestimoDTO> listaremprestimo(Long  usuarioid, @PathVariable String id){

        return emprestimoService.listarEmprestimos(usuarioid);
    }
}

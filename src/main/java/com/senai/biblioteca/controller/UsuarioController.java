package com.senai.biblioteca.controller;

import com.senai.biblioteca.dto.UsuarioDTO;
import com.senai.biblioteca.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO dto){

        return usuarioService.criarUsuario(dto);
    }

    @GetMapping
    public List<UsuarioDTO> listarUsuario()
    {

        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDTO buscarPorId(@PathVariable Long id)
    {
        return usuarioService.buscarPorId(id);}

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
    }

    @PutMapping("/{id}")
    public UsuarioDTO atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioDTO dto)
    {
        return usuarioService.atualizarUsuario(id,dto);


    }

}

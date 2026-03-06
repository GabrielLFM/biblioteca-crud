package com.senai.biblioteca.service;

import com.senai.biblioteca.dto.UsuarioDTO;
import com.senai.biblioteca.entity.Usuario;
import com.senai.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO criarUsuario(UsuarioDTO dto) {
        Usuario user = new Usuario(dto);
        usuarioRepository.save(user);
        return new UsuarioDTO(user.getNome(), user.getEmail());
    }
}

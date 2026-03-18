package com.senai.biblioteca.service;

import com.senai.biblioteca.dto.CarteiraDTO;
import com.senai.biblioteca.dto.UsuarioDTO;
import com.senai.biblioteca.entity.CarteiraBiblioteca;
import com.senai.biblioteca.entity.Usuario;
import com.senai.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public UsuarioDTO criarUsuario(UsuarioDTO dto) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByEmail(dto.getEmail());
        if (usuarioExistente.isPresent()) {
            throw new RuntimeException("email ja registrado");
        }
        Usuario usuario = new Usuario();
        usuario.setEmail(dto.getEmail());
        usuario.setNome(dto.getNome());
        usuarioRepository.save(usuario);

        UsuarioDTO userDto = new UsuarioDTO(
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getId(),
                usuario.getCarteira()
        );
        return userDto;
    }


    public List<UsuarioDTO>listarUsuarios(){

        List<Usuario> usuarios = usuarioRepository.findAll();

        return usuarios.stream().map(
                usuario -> new UsuarioDTO(
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getId(),
                        usuario.getCarteira()
                )).toList();

    }



    public UsuarioDTO buscarPorId(Long id) {

        Usuario usuario = usuarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario não encotrado"));
        return new UsuarioDTO(
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getId(),
                usuario.getCarteira());
    }


    public void deletarUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario não encontrado"));
        usuarioRepository.delete(usuario);
    }


    public UsuarioDTO atualizarUsuario(Long id, UsuarioDTO dto) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario não encontrado"));

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuarioRepository.save(usuario);
        UsuarioDTO userDto = new UsuarioDTO(
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getId(),
                usuario.getCarteira()
        );
        return userDto;

    }


}

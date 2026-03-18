package com.senai.biblioteca.service;

import com.senai.biblioteca.dto.EmprestimoDTO;
import com.senai.biblioteca.entity.Emprestimo;
import com.senai.biblioteca.entity.Usuario;
import com.senai.biblioteca.repository.EmprestimoRepository;
import com.senai.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final UsuarioRepository usuarioRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository, UsuarioRepository usuarioRepository) {
        this.emprestimoRepository = emprestimoRepository;
        this.usuarioRepository = usuarioRepository;
    }



    public EmprestimoDTO criarEmprestimo(Long usuarioid, EmprestimoDTO dto){

        Usuario usuario = usuarioRepository.findById(usuarioid).
                orElseThrow(()->new RuntimeException("Usuario não encontrado"));

        Emprestimo Emprestimo = new Emprestimo();


        Emprestimo.setDataEmprestimo(dto.getDataEmprestimo());
        Emprestimo.setDataDevolucao(dto.getDataDevolucao());
        Emprestimo.setUsuario(usuario);
        emprestimoRepository.save(Emprestimo);

        EmprestimoDTO empreDto = new EmprestimoDTO(
                Emprestimo.getId(),
                Emprestimo.getDataEmprestimo(),
                Emprestimo.getDataDevolucao(),
                Emprestimo.getUsuario()
        );
        return empreDto;
    }


    public List<EmprestimoDTO> listarEmprestimos(Long usuarioid ){
        Usuario usuario = usuarioRepository.findById(usuarioid).orElseThrow(()-> new RuntimeException("Usuario não encontrado"));

        List<Emprestimo> emprestimos = usuario.getEmprestimos();

        return emprestimos.stream().map(emprestimo -> new EmprestimoDTO(

                emprestimo.getId(),
                emprestimo.getDataEmprestimo(),
                emprestimo.getDataDevolucao(),
                emprestimo.getUsuario()
        )).toList();

    }
}

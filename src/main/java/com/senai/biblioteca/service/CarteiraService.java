package com.senai.biblioteca.service;

import com.senai.biblioteca.dto.CarteiraDTO;
import com.senai.biblioteca.entity.CarteiraBiblioteca;
import com.senai.biblioteca.entity.Usuario;
import com.senai.biblioteca.repository.CarteiraRepository;
import com.senai.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;


@Service
public class CarteiraService {

    private final CarteiraRepository carteiraRepository;
    private final UsuarioRepository usuarioRepository;

    public CarteiraService(CarteiraRepository carteiraRepository, UsuarioRepository usuarioRepository) {
        this.carteiraRepository = carteiraRepository;
        this.usuarioRepository = usuarioRepository;
    }


    public CarteiraDTO criarCarteira(Long Id, CarteiraDTO dto){

        var usuario = usuarioRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        if(usuario.getCarteira() != null){

            throw new RuntimeException("Usuario já possui carteira");
        }

        CarteiraBiblioteca carteira = new CarteiraBiblioteca();

        carteira.setDataEmissao(dto.getDataEmissao());
        carteira.setValid(true);
        carteira.setUsuario(usuario);

        carteiraRepository.save(carteira);

        return new CarteiraDTO(
                carteira.getNumeroCredencial(),
                carteira.getDataEmissao(),
                carteira.isValid(),
                carteira.getUsuario()
        );
    }

}

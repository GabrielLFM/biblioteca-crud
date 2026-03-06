package com.senai.biblioteca.repository;

import com.senai.biblioteca.entity.CarteiraBiblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteiraRepository extends JpaRepository<CarteiraBiblioteca, Long> {
}

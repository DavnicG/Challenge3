package com.example.Challenge3_Literalura.repository;


import com.example.Challenge3_Literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, String> {
    List<Libro> findByLanguage(String language);
    List<Libro> findByAuthorsContaining(String author);
    Optional<Libro> findByTitle(String title);  // Busca por título para evitar duplicados
}


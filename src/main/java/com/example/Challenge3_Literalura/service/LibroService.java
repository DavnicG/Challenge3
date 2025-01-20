package com.example.Challenge3_Literalura.service;

import com.example.Challenge3_Literalura.model.Libro;
import com.example.Challenge3_Literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    private static final String API_URL = "https://gutendex.com/books/?search=";

    public Libro buscarLibroPorTitulo(String title) {
        Optional<Libro> libroExistente = libroRepository.findByTitle(title);
        if (libroExistente.isPresent()) {
            return libroExistente.get();
        }

        // Consumir la API
        String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                .queryParam("title", title)
                .toUriString();

        RestTemplate restTemplate = new RestTemplate();
        Libro[] libros = restTemplate.getForObject(url, Libro[].class);

        if (libros != null && libros.length > 0) {
            Libro libro = libros[0];  // Tomamos el primer libro de la respuesta
            libroRepository.save(libro);  // Guardamos en la base de datos
            return libro;
        }
        return null;
    }

    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public List<Libro> listarLibrosPorIdioma(String idioma) {
        return libroRepository.findByLanguage(idioma);
    }

    public List<Libro> listarAutoresPorNombre(String nombreAutor) {
        return libroRepository.findByAuthorsContaining(nombreAutor);
    }
}


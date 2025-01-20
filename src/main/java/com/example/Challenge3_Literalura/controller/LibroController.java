package com.example.Challenge3_Literalura.controller;

import com.example.Challenge3_Literalura.model.Libro;
import com.example.Challenge3_Literalura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Scanner;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    private static final Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("*******************************");
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Listar libros registrados");
            System.out.println("3. Listar libros por idioma");
            System.out.println("4. Listar autores por nombre");
            System.out.println("5. Salir");
            System.out.println("*******************************");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada
            System.out.println("*******************************");

            switch (opcion) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarLibrosPorIdioma();
                    break;
                case 4:
                    listarAutoresPorNombre();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void buscarLibroPorTitulo() {
        System.out.print("Ingrese el título del libro: ");
        String title = scanner.nextLine();
        Libro libro = libroService.buscarLibroPorTitulo(title);
        if (libro != null) {
            System.out.println("Título: " + libro.getTitle());
            System.out.println("Autor: " + libro.getAuthors());
            System.out.println("Idioma: " + libro.getLanguage());
            System.out.println("Descargas: " + libro.getDownloadCount());
        } else {
            System.out.println("No se encontró el libro.");
        }
    }

    private void listarLibrosRegistrados() {
        List<Libro> libros = libroService.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro.getTitle());
        }
    }

    private void listarLibrosPorIdioma() {
        System.out.print("Ingrese el idioma (ES, EN, FR, PT): ");
        String idioma = scanner.nextLine();
        List<Libro> libros = libroService.listarLibrosPorIdioma(idioma);
        for (Libro libro : libros) {
            System.out.println(libro.getTitle());
        }
    }

    private void listarAutoresPorNombre() {
        System.out.print("Ingrese el nombre del autor: ");
        String autor = scanner.nextLine();
        List<Libro> libros = libroService.listarAutoresPorNombre(autor);
        for (Libro libro : libros) {
            System.out.println(libro.getTitle());
        }
    }
}

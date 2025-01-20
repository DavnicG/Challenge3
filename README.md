# Challenge3_Literalura

## Descripción

Este es un proyecto de Java basado en Spring Boot que interactúa con la API de Gutendex para buscar libros por título. Utiliza la API de Gutendex para obtener información sobre libros disponibles en el Proyecto Gutenberg, como el título, autores, temas, idiomas y enlaces para descargar los libros en diferentes formatos.

El propósito principal de la aplicación es realizar búsquedas de libros según su título y mostrar los resultados al usuario, incluyendo detalles sobre cada libro como su autor, temas, y la cantidad de descargas.

## Características

- Realiza búsquedas de libros en la API de Gutendex por título.
- Muestra detalles del libro: título, autores, idiomas, temas y enlaces para descarga.
- Soporta múltiples formatos de libros (EPUB, Mobi, HTML, etc.).
- Interfaz basada en consola para interactuar con el usuario.

## Requisitos

- Java 17 o superior.
- Maven (para la gestión de dependencias y la construcción del proyecto).
- Conexión a Internet

##Uso

La aplicación se ejecuta en la consola y solicita al usuario que ingrese un título de libro. Después de realizar la búsqueda, la aplicación mostrará los resultados de los libros disponibles en la API de Gutendex.

Por ejemplo, si buscas "Pride", la aplicación mostrará libros como:

Título: Gaudenzia, Pride of the Palio
Autor(es): Henry, Marguerite
Temas: Horse racing -- Juvenile fiction, Palio di Siena (Festival) (Siena, Italy) -- Juvenile fiction
Idiomas: Inglés
Enlaces para descarga en varios formatos.

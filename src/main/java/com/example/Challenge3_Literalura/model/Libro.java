package com.example.Challenge3_Literalura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Libro {

    @Id
    private String title;  // Usamos el título como identificador único

    private String authors;
    private String language;
    private String downloadCount;

    // Getters y setters

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthors() {
        return authors;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getDownloadCount() {
        return downloadCount;
    }
    public void setDownloadCount(String downloadCount) {
        this.downloadCount = downloadCount;
    }

}


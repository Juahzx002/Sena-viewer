package com.senaviewer.model;

import java.util.ArrayList;
import java.util.Date; // Necesitará Date para edititionDate
import java.util.List;

public abstract class Publication {
    // Atributos base
    private String title;
    private Date edititionDate;
    private String editorial;
    private List<String> authors;

    // Constructor solicitado para Publication
    public Publication(String title, Date edititionDate, String editorial) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.authors = new ArrayList<>(); // Inicializar lista de autores
    }

    // Getters y Setters
    // ... (omito, pero deben crearse)

    public String getTitle() {
        return title;
    }

    public Date getEdititionDate() {
        return edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    
    // toString()
    @Override
    public String toString() {
        return "Título: " + title + "\n" +
               "Fecha de Edición: " + edititionDate + "\n" +
               "Editorial: " + editorial + "\n" +
               "Autores: " + authors.toString();
    }
}

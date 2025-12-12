package com.senaviewer.model; // DEBE ser esta línea

import java.util.Date;

public abstract class Film {
    // Atributos base
    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration; // Duración en minutos
    private int year;
    private boolean viewed; // Indicador de visualización

    // Constructor solicitado para Film
    public Film(String title, String genre, String creator, int duration, int year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = false; // Por defecto, no visto
    }

    // Getters y Setters
    // ... (omito los demás para ahorrar espacio, pero deben crearse)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    
    // El resto de Getters y Setters deben ir aquí

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Título: " + title + "\n" +
               "Género: " + genre + "\n" +
               "Creador: " + creator + "\n" +
               "Duración: " + duration + " min\n" +
               "Año: " + year + "\n" +
               "Visto: " + (viewed ? "Sí" : "No");
    }
}

// ------------------------------


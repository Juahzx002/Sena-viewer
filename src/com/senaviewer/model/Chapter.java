package com.senaviewer.model;

public class Chapter {
    // Atributos
    private int id;
    private String title;
    private int duration; // Duración en minutos
    private int year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;

    // Constructor solicitado
    public Chapter(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = false;
        this.timeViewed = 0;
        this.sessionNumber = 0;
    }
    
    // Getters y Setters
    // ... (deben crearse para todos los atributos)
    
    // toString()
    @Override
    public String toString() {
        return "Capítulo: " + title + 
               " | Duración: " + duration + " min" +
               " | Año: " + year +
               " | Visto: " + (viewed ? "Sí" : "No");
    }
}
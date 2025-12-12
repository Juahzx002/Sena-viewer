package com.senaviewer.model;

public class Movie extends Film {
    // Atributos específicos
    private int timeViewed; // Tiempo dedicado a ver la película

    // Constructor, llama al constructor del padre (Film)
    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration, year);
        this.timeViewed = 0; // Por defecto
    }

    // Getters y Setters específicos
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tiempo Visto: " + timeViewed + " min\n" +
               "Tipo: Película";
    }
}
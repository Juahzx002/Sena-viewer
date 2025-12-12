package com.senaviewer.model;

import java.util.Date;

public class Book extends Publication {
    // Atributos específicos
    private int id; // Se requiere, pero no en el padre
    private String isbn;
    private boolean readed;
    private int timeReaded;

    // Constructor solicitado
    public Book(String title, Date edititionDate, String editorial, String isbn) {
        super(title, edititionDate, editorial);
        this.isbn = isbn;
        this.readed = false;
        this.timeReaded = 0;
    }
    
    // Getters y Setters específicos
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "ID: " + id + "\n" +
               "ISBN: " + isbn + "\n" +
               "Leído: " + (readed ? "Sí" : "No") + "\n" +
               "Tiempo Leído: " + timeReaded + " min\n" +
               "Tipo: Libro";
    }
}
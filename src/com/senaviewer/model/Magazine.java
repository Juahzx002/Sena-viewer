package com.senaviewer.model;

import java.util.Date;

public class Magazine extends Publication {
    // Atributos específicos
    private int id; // Se requiere, pero no en el padre

    // Constructor solicitado
    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }

    // Getters y Setters específicos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "ID: " + id + "\n" +
               "Tipo: Revista";
    }
}
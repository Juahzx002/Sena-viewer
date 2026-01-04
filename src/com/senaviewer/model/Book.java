package com.senaviewer.model;

import com.senaviewer.interfaz.IVisualizable;
import java.util.Date;

public class Book extends Publication implements IVisualizable {
    // ... (atributos existentes)
    private boolean readed;
    private int timeReaded; // Ahora medido en segundos para consistencia con Movie

    // ... (Constructor y Getters/Setters)

    // Implementación de IVisualizable
    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateI != null && dateF != null) {
            long initialTime = dateI.getTime();
            long finalTime = dateF.getTime();
            
            int seconds = (int) ((finalTime - initialTime) / 1000); 
            
            // Asumimos que leer cualquier cantidad de tiempo lo marca como "leído"
            if (seconds > 0) {
                this.setReaded(true);
            }
            
            this.timeReaded = seconds; // Guardamos el tiempo leído en segundos
        }
    }
    
    // toString()
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "ID: " + getId() + "\n" +
               "ISBN: " + getIsbn() + "\n" +
               "Leído: " + (readed ? "Sí" : "No") + "\n" +
               "Tiempo Leído: " + timeReaded + " segundos" + "\n" +
               "Tipo: Libro";
    }
}
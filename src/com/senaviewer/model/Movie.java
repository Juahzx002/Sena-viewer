package com.senaviewer.model;

import com.senaviewer.interfaz.IVisualizable;
import java.util.Date;

public class Movie extends Film implements IVisualizable {
    // ... (atributos existentes)
    private int timeViewed; 
    
    // ... (Constructor y Getters/Setters)

    // Implementación de IVisualizable
    @Override
    public Date startToSee(Date dateI) {
        // En una app real, esto podría empezar un contador.
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        // Lógica: La diferencia entre dateF y dateI es el tiempo total visto.
        if (dateI != null && dateF != null) {
            long initialTime = dateI.getTime();
            long finalTime = dateF.getTime();
            
            // Calcula la diferencia en segundos para simplicidad
            int seconds = (int) ((finalTime - initialTime) / 1000); 
            
            // Si el tiempo visto es mayor o igual a la duración, se marca como visto
            if (seconds >= this.getDuration() * 60) { // Duración en segundos
                this.setViewed(true);
            }
            
            this.timeViewed = seconds; // Guardamos el tiempo visto en segundos
        }
    }
    
    // toString()
    @Override
    public String toString() {
        // Mejorar la salida del tiempo
        return super.toString() + "\n" +
               "Tiempo Visto: " + timeViewed + " segundos" + "\n" +
               "Tipo: Película";
    }
}
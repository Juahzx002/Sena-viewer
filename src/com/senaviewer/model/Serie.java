package com.senaviewer.model;

public class Serie extends Film {
    // Atributos específicos
    private int timeViewed; // Tiempo total dedicado a ver la serie
    private int sessionQuantity; // Número total de temporadas/sesiones

    // Constructor (Note: solo usa los parámetros solicitados para Serie)
    public Serie(String title, String genre, int duration) {
        super(title, genre, "", duration, 0); // creator y year en 0 o vacío si no se piden en el constructor
        this.timeViewed = 0;
        this.sessionQuantity = 0;
    }
    
    // Opcional: Constructor que acepta todos los campos de Film para inicialización
    /*
    public Serie(String title, String genre, String creator, int duration, int year, int sessionQuantity) {
        super(title, genre, creator, duration, year); 
        this.timeViewed = 0;
        this.sessionQuantity = sessionQuantity;
    }
    */
    
    // Getters y Setters específicos
    // ...

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tiempo Visto Total: " + timeViewed + " min\n" +
               "Cantidad de Sesiones: " + sessionQuantity + "\n" +
               "Tipo: Serie";
    }
}
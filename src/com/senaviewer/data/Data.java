package com.senaviewer.data;

import com.senaviewer.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    
    // Simula una base de datos o un gestor de IDs
    private static int contentIdCounter = 1;

    public static List<Movie> movies;
    public static List<Serie> series;
    public static List<Book> books;
    public static List<Magazine> magazines;

    /**
     * Inicializa todos los datos de contenido (catálogo).
     */
    public static void initializeData() {
        movies = createMoviesList();
        series = createSeriesList();
        books = createBooksList();
        magazines = createMagazinesList();
    }

    private static List<Movie> createMoviesList() {
        List<Movie> list = new ArrayList<>();
        
        Movie m1 = new Movie("Interestelar", "Ciencia Ficción", "Christopher Nolan", 169, 2014);
        m1.setId(contentIdCounter++);
        list.add(m1);
        
        Movie m2 = new Movie("El Origen", "Thriller", "Christopher Nolan", 148, 2010);
        m2.setId(contentIdCounter++);
        list.add(m2);
        
        return list;
    }

    private static List<Serie> createSeriesList() {
        List<Serie> list = new ArrayList<>();
        
        // Constructor: titulo, genro, duracion
        Serie s1 = new Serie("Stranger Things", "Terror/Ficción", 50);
        s1.setId(contentIdCounter++);
        s1.setCreator("Hermanos Duffer");
        s1.setYear(2016);
        s1.setSessionQuantity(5);
        list.add(s1);
        
        return list;
    }

    private static List<Book> createBooksList() {
        List<Book> list = new ArrayList<>();
        
        // Date es java.util.Date
        Book b1 = new Book("Cien años de soledad", new Date(1967, 5, 30), "Sudamericana", "978-0307474728");
        b1.setId(contentIdCounter++);
        b1.getAuthors().add("Gabriel García Márquez");
        list.add(b1);
        
        return list;
    }

    private static List<Magazine> createMagazinesList() {
        List<Magazine> list = new ArrayList<>();
        
        Magazine mag1 = new Magazine("National Geographic - Edición Selva", new Date(2023, 10, 1), "National Geographic Partners");
        mag1.setId(contentIdCounter++);
        list.add(mag1);

        return list;
    }
}

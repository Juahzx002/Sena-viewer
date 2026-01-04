package com.senaviewer.app;

import com.senaviewer.data.Data;
import com.senaviewer.model.*; // Importar todos los modelos
import com.senaviewer.util.Util;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit; // Para simular el tiempo

public class SenaViewerApp {

    // ... (main y showMenu son iguales)

    /**
     * Muestra la lista de películas y permite al usuario ver una.
     */
    public static void showMovies() {
        if (Data.movies.isEmpty()) {
            System.out.println("No hay películas disponibles.");
            return;
        }
        
        System.out.println("\n🎬 Sección de Películas");
        
        for (int i = 0; i < Data.movies.size(); i++) {
            Movie movie = Data.movies.get(i);
            String viewedStatus = movie.isViewed() ? " [VISTO ✔️]" : " [PENDIENTE]";
            System.out.println((i + 1) + ". " + movie.getTitle() + viewedStatus);
        }
        System.out.println("0. Volver al menú principal");

        int selection = Util.validateUserSelection("Seleccione la película que desea ver (o 0 para volver): ");

        if (selection > 0 && selection <= Data.movies.size()) {
            Movie selectedMovie = Data.movies.get(selection - 1);
            viewContent(selectedMovie);
        } else if (selection != 0) {
            System.out.println("❌ Opción de película no válida.");
        }
    }
    
    /**
     * Simula la visualización de una película o libro y marca el estado.
     * @param content El contenido que implementa IVisualizable (Movie o Book).
     */
    private static void viewContent(Object content) {
        if (content instanceof Movie) {
            Movie movie = (Movie) content;
            System.out.println("\n--- VIENDO PELÍCULA: " + movie.getTitle() + " ---");
            System.out.println("Duración: " + movie.getDuration() + " min");

            Date dateI = movie.startToSee(new Date());
            
            // SIMULACIÓN DE TIEMPO: Simulamos que pasa un tiempo
            System.out.println("Simulando que el usuario ve la película...");
            
            // Espera 3 segundos (simulando que el tiempo pasó)
            try {
                TimeUnit.SECONDS.sleep(3); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Date dateF = new Date();
            movie.stopToSee(dateI, dateF);

            System.out.println("--- FIN DE VISUALIZACIÓN ---");
            System.out.println("Resultado:");
            System.out.println(movie.toString());

        } else if (content instanceof Book) {
            Book book = (Book) content;
            System.out.println("\n--- LEYENDO LIBRO: " + book.getTitle() + " ---");
            
            Date dateI = book.startToSee(new Date());
            
            // SIMULACIÓN DE TIEMPO
            System.out.println("Simulando que el usuario lee el libro por un rato...");
            
            // Espera 2 segundos (simulando que el tiempo pasó)
            try {
                TimeUnit.SECONDS.sleep(2); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Date dateF = new Date();
            book.stopToSee(dateI, dateF);
            
            System.out.println("--- FIN DE LECTURA ---");
            System.out.println("Resultado:");
            System.out.println(book.toString());
        }
    }
    
    // Métodos para otras secciones (Series, Books, Magazines, Reports)
    
    public static void showSeries() {
        System.out.println("\n📺 Sección de Series (Implementación pendiente de capítulos)");
    }
    
    public static void showBooks() {
        if (Data.books.isEmpty()) {
            System.out.println("No hay libros disponibles.");
            return;
        }
        
        System.out.println("\n📚 Sección de Libros");
        
        for (int i = 0; i < Data.books.size(); i++) {
            Book book = Data.books.get(i);
            String readStatus = book.isReaded() ? " [LEÍDO ✔️]" : " [PENDIENTE]";
            System.out.println((i + 1) + ". " + book.getTitle() + readStatus);
        }
        System.out.println("0. Volver al menú principal");

        int selection = Util.validateUserSelection("Seleccione el libro que desea leer (o 0 para volver): ");

        if (selection > 0 && selection <= Data.books.size()) {
            Book selectedBook = Data.books.get(selection - 1);
            viewContent(selectedBook);
        } else if (selection != 0) {
            System.out.println("❌ Opción de libro no válida.");
        }
    }

    public static void showMagazines() {
        System.out.println("\n📰 Sección de Revistas (Las revistas no son visualizables/leíbles según requisitos)");
    }

    public static void makeReport() {
        System.out.println("\n📊 Generando Reporte General...");
        // Lógica de Reporte aquí
    }

    public static void makeReportToday() {
        System.out.println("\n🗓️ Generando Reporte del Día...");
        // Lógica de Reporte Diario aquí
    }
}
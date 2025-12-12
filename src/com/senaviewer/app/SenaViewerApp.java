package com.senaviewer.app;

import com.senaviewer.data.Data;
import com.senaviewer.util.Util;

public class SenaViewerApp {

    public static void main(String[] args) {
        // 1. Inicializar datos de prueba
        Data.initializeData();
        
        System.out.println("✨ Bienvenido a SENA Viewer ✨");
        showMenu();
    }

    /**
     * Muestra el menú principal y maneja la navegación.
     */
    public static void showMenu() {
        int exit = 0;
        int option;

        do {
            System.out.println("\n==================================");
            System.out.println("          MENÚ PRINCIPAL          ");
            System.out.println("==================================");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("----------------------------------");
            System.out.println("5. Report (General)");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.println("==================================");

            // Usa la función de validación de entrada
            option = Util.validateUserSelection("Seleccione una opción: ");

            switch (option) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReportToday();
                    break;
                case 0:
                    exit = 1;
                    System.out.println("👋 ¡Gracias por usar SENA Viewer! Saliendo...");
                    Util.closeScanner();
                    break;
                default:
                    System.out.println("❌ Opción inválida. Por favor, ingrese un número entre 0 y 6.");
                    break;
            }

        } while (exit != 1);
    }
    
    // --- Métodos de Navegación (implementación completa en Etapa 3) ---

    public static void showMovies() {
        System.out.println("\n🎬 Sección de Películas");
        // Aquí se mostraría la lista de Data.movies
        for (int i = 0; i < Data.movies.size(); i++) {
            System.out.println( (i + 1) + ". " + Data.movies.get(i).getTitle());
        }
        System.out.println("Regresando al menú principal...");
    }
    
    public static void showSeries() {
        System.out.println("\n📺 Sección de Series");
        System.out.println("Regresando al menú principal...");
    }
    
    public static void showBooks() {
        System.out.println("\n📚 Sección de Libros");
        System.out.println("Regresando al menú principal...");
    }

    public static void showMagazines() {
        System.out.println("\n📰 Sección de Revistas");
        System.out.println("Regresando al menú principal...");
    }

    public static void makeReport() {
        System.out.println("\n📊 Generando Reporte General...");
        System.out.println("Regresando al menú principal...");
    }

    public static void makeReportToday() {
        System.out.println("\n🗓️ Generando Reporte del Día...");
        System.out.println("Regresando al menú principal...");
    }
}

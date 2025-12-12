package com.senaviewer.util;

import java.util.Scanner;

public class Util {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * Muestra un mensaje y asegura que la entrada del usuario es un entero.
     * @param message El mensaje a mostrar al usuario (ej: "Seleccione una opción: ").
     * @return El número entero introducido por el usuario.
     */
    public static int validateUserSelection(String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("❌ ERROR: Ingrese un número válido.");
            System.out.print(message);
            sc.next(); // Consume la entrada no válida
        }
        int selection = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea restante
        return selection;
    }

    /**
     * Cierra el Scanner al finalizar la aplicación.
     */
    public static void closeScanner() {
        sc.close();
    }
}

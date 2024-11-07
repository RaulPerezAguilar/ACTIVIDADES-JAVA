package ejercicio.pkg16;

import java.util.Scanner;

public class EJERCICIO16 {

    public static void main(String[] args) {
        // Solicitar un número entero al usuario
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar un número entero al usuario
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();
            // Comprobar si el número es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
            // Cerrar el scanner
        }
    }
}


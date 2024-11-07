package ejercicio.pkg22;

import java.util.Scanner;

public class EJERCICIO22 {

    public static void main(String[] args) {
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            int numero;
            // Repetir el proceso hasta que el número sea 0
            do {
                // Pedir un número al usuario
                System.out.print("Introduce un número (0 para salir): ");
                numero = scanner.nextInt();
                
                // Si el número no es 0, mostrar la información
                if (numero != 0) {
                    // Comprobar si es par
                    if (numero % 2 == 0) {
                        System.out.println("El número " + numero + " es par.");
                    } else {
                        System.out.println("El número " + numero + " es impar.");
                    }
                    
                    // Comprobar si es positivo
                    if (numero > 0) {
                        System.out.println("El número " + numero + " es positivo.");
                    } else if (numero < 0) {
                        System.out.println("El número " + numero + " es negativo.");
                    }
                    
                    // Mostrar el cuadrado del número
                    System.out.println("El cuadrado del número " + numero + " es: " + (numero * numero));
                }
            } while (numero != 0); // Termina el bucle cuando el número es 0
            // Cerrar el scanner
        }
        
        System.out.println("Fin del programa.");
    }
}

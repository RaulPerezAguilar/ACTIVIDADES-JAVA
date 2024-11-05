package ejercicio.pkg7;

import java.util.Scanner;

public class EJERCICIO7 {

    public static void main(String[] args) {
        // Solicitar la edad del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar la edad del usuario
            System.out.print("Por favor, introduce tu edad: ");
            int edad = scanner.nextInt();
            // Determinar si es mayor o menor de edad
            boolean esMayorDeEdad = edad >= 18;
            // Mostrar el resultado
            System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
            // Cerrar el scanner
        }
    }
}

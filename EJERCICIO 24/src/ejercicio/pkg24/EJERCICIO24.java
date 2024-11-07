package ejercicio.pkg24;

import java.util.Scanner;

public class EJERCICIO24 {

    public static void main(String[] args) {
        // Variables para almacenar la edad mínima y máxima
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Variables para almacenar la edad mínima y máxima
            int edadMinima = Integer.MAX_VALUE;  // Inicializamos con el valor más alto posible
            int edadMaxima = Integer.MIN_VALUE;  // Inicializamos con el valor más bajo posible
            int edad;
            // Bucle para introducir edades
            while (true) {
                // Pedir la edad del alumno
                System.out.print("Introduce la edad del alumno (o -1 para terminar): ");
                edad = scanner.nextInt();
                
                // Comprobar si el usuario quiere terminar
                if (edad == -1) {
                    break;
                }
                
                // Actualizar las edades mínima y máxima
                if (edad < edadMinima) {
                    edadMinima = edad;
                }
                if (edad > edadMaxima) {
                    edadMaxima = edad;
                }
            }   // Verificar si se introdujeron edades válidas
            if (edadMinima == Integer.MAX_VALUE || edadMaxima == Integer.MIN_VALUE) {
                System.out.println("No se introdujeron edades válidas.");
            } else {
                // Mostrar la edad mínima y máxima
                System.out.println("La edad mínima es: " + edadMinima);
                System.out.println("La edad máxima es: " + edadMaxima);
            }
            // Cerrar el scanner
        } // Inicializamos con el valor más alto posible
    }
}

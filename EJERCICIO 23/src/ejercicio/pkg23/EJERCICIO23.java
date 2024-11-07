package ejercicio.pkg23;

import java.util.Scanner;
import java.util.Random;

public class EJERCICIO23 {

    public static void main(String[] args) {
        // Crear un objeto Random para generar el número aleatorio
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Crear un objeto Random para generar el número aleatorio
            Random random = new Random();
            // Generar un número aleatorio entre 1 y 100 (inclusive)
            int numeroAleatorio = random.nextInt(100) + 1;
            int numeroUsuario;
            // Bucle que se repite hasta que el usuario adivine el número
            do {
                System.out.print("Adivina el número (entre 1 y 100): ");
                numeroUsuario = scanner.nextInt();
                
                // Comprobar si el número ingresado es mayor, menor o igual al número aleatorio
                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número es mayor. Intenta de nuevo.");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número es menor. Intenta de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                }
            } while (numeroUsuario != numeroAleatorio); // El bucle continúa hasta que el usuario acierte
            // Cerrar el scanner
        }
    }
}

package ejercicio.pkg25;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO25 {

    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Crear un objeto Random para generar números aleatorios
            Random random = new Random();
            // Contador de operaciones correctas
            int operacionesCorrectas = 0;
            // Variable para almacenar la respuesta del usuario
            int respuestaUsuario;
            // Iniciar el juego
            while (true) {
                // Generar dos números aleatorios entre 1 y 100
                int num1 = random.nextInt(100) + 1;
                int num2 = random.nextInt(100) + 1;
                
                // Calcular la respuesta correcta
                int resultado = num1 + num2;
                
                // Pedir al jugador que resuelva la suma
                System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
                respuestaUsuario = scanner.nextInt();
                
                // Comprobar si la respuesta es correcta
                if (respuestaUsuario == resultado) {
                    // Si la respuesta es correcta, incrementar el contador
                    operacionesCorrectas++;
                } else {
                    // Si la respuesta es incorrecta, terminar el juego y mostrar el puntaje
                    System.out.println("Respuesta incorrecta. ¡Juego terminado!");
                    System.out.println("Operaciones correctas: " + operacionesCorrectas);
                    break;
                }
            }
            // Cerrar el scanner
        }
    }
}

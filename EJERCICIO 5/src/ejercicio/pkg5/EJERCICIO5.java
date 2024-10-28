package ejercicio.pkg5;

import java.util.Scanner;

public class EJERCICIO5 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las dos notas
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner Scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese las dos notas
            System.out.print("Ingrese la primera nota: ");
            int nota1 = Scanner.nextInt();
            System.out.print("Ingrese la segunda nota: ");
            int nota2 = Scanner.nextInt();
            // Calcular la media aritmética
            double media = (nota1 + nota2) / 2.0;
            // Mostrar el resultado
            System.out.printf("La media entre las dos notas es: %.2f%n", media);
            // Cerrar el scanner
        }
    }
}

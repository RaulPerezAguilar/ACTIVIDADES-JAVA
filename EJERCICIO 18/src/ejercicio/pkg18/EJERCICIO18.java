package ejercicio.pkg18;

import java.util.Scanner;

public class EJERCICIO18 {

    public static void main(String[] args) {
        // Pedir al usuario que ingrese un número decimal
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese un número decimal
            System.out.print("Introduce un número decimal: ");
            double numero = scanner.nextDouble();
            // Verificar si el número está en el rango casi-cero
            if (numero != 0 && Math.abs(numero) < 1) {
                System.out.println("El número " + numero + " es un número casi-cero.");
            } else {
                System.out.println("El número " + numero + " no es un número casi-cero.");
            }
            // Cerrar el scanner
        }
    }
}

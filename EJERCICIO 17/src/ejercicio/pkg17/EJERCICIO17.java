package ejercicio.pkg17;

import java.util.Scanner;

public class EJERCICIO17 {

    public static void main(String[] args) {
        // Pedir al usuario que ingrese dos números enteros
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese dos números enteros
            System.out.print("Introduce el primer número entero: ");
            int numero1 = scanner.nextInt();
            System.out.print("Introduce el segundo número entero: ");
            int numero2 = scanner.nextInt();
            // Comprobar si los números son iguales
            if (numero1 == numero2) {
                System.out.println("Los números son iguales.");
            } else {
                System.out.println("Los números son diferentes.");
            }   // Determinar cuál es el mayor
            if (numero1 > numero2) {
                System.out.println("El número mayor es: " + numero1);
            } else if (numero2 > numero1) {
                System.out.println("El número mayor es: " + numero2);
            } else {
                System.out.println("Ambos números son iguales, por lo tanto no hay un número mayor.");
            }
            // Cerrar el scanner
        }
    }
}


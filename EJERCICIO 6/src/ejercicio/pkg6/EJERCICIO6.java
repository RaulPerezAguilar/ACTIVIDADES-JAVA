/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Raul Perez Aguilar
 */
public class EJERCICIO6 {

    // Definir PI como una constante
    public static final double PI = 3.141592653589793;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar al usuario que introduzca el radio
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que introduzca el radio
            System.out.print("Introduce el radio de la circunferencia: ");
            double radio = scanner.nextDouble();
            // Calcular la longitud de la circunferencia
            double longitud = 2 * PI * radio;
            // Calcular el área de la circunferencia
            double area = PI * radio * radio;
            // Mostrar los resultados
            System.out.printf("La longitud de la circunferencia es: %.2f%n", longitud);
            System.out.printf("El área de la circunferencia es: %.2f%n", area);
            // Cerrar el scanner
        }
    }
}


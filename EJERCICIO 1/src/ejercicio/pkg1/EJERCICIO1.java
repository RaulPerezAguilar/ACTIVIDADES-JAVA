/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author RaulPerezAguilar
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir al usuario que introduzca un numero
        try ( // Crear un objeto Scanner para leer el numero
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que introduzca un numero
            System.out.print("Introduce un número: ");
            // Leer el número introducido por el usuario
            int numero = scanner.nextInt();
            // Mostrar el número en pantalla
            System.out.println("El número introducido es: " + numero);
            // Cerrar el scanner
        }
    }
}

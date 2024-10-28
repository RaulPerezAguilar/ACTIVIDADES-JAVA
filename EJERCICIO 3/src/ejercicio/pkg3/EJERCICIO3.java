/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.Scanner; // Importar la clase Scanner para la entrada de datos

/**
 *
 * @author RaulPerezAguilar
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el año actual
        System.out.print("Introduce el año actual: ");
        int anioActual = scanner.nextInt(); // Leer el año actual
        
        // Pedir al usuario que ingrese su año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt(); // Leer el año de nacimiento
        
        // Calcular la edad restando el año de nacimiento del año actual
        int edad = anioActual - anioNacimiento;
        
        // Mostrar la edad calculada
        System.out.println("Tu edad es: " + edad + " años.");
        
        // Cerrar el scanner
        scanner.close();
    }
    
}

package ejercicio.pkg32;

import java.util.Scanner;

public class EJERCICIO32 {

    // Función que recibe dos números y devuelve el mayor de ellos
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Leer dos números enteros
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Llamar a la función maximo y almacenar el resultado
        int resultado = maximo(num1, num2);
        
        // Imprimir el máximo de los dos números
        System.out.println("El número mayor es: " + resultado);
        
        // Cerrar el scanner
        scanner.close();
    }
}

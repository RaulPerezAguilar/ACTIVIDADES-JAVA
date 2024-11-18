package ejercicio.pkg33;

import java.util.Scanner;

public class EJERCICIO33 {

    // Función que recibe dos números y devuelve el mayor de ellos
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Sobrecarga de la función maximo, ahora para tres números
    public static int maximo(int a, int b, int c) {
        // Utilizamos la función maximo para comparar el mayor de los tres números
        int maxDeDos = maximo(a, b);  // Calculamos el máximo de los primeros dos
        return maximo(maxDeDos, c);    // Calculamos el máximo entre maxDeDos y c
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Leer tres números enteros
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Llamar a la función maximo con tres parámetros y almacenar el resultado
        int resultado = maximo(num1, num2, num3);
        
        // Imprimir el máximo de los tres números
        System.out.println("El número mayor es: " + resultado);
        
        // Cerrar el scanner
        scanner.close();
    }
}

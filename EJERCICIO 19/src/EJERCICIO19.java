import java.util.Scanner;

public class EJERCICIO19 {

    public static void main(String[] args) {
        // Solicitar tres números al usuario
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar tres números al usuario
            System.out.print("Introduce el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            int num2 = scanner.nextInt();
            System.out.print("Introduce el tercer número: ");
            int num3 = scanner.nextInt();
            int mayor, medio, menor;
            // Ordenar los números de mayor a menor
            if (num1 >= num2 && num1 >= num3) {
                mayor = num1;
                if (num2 >= num3) {
                    medio = num2;
                    menor = num3;
                } else {
                    medio = num3;
                    menor = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                mayor = num2;
                if (num1 >= num3) {
                    medio = num1;
                    menor = num3;
                } else {
                    medio = num3;
                    menor = num1;
                }
            } else {
                mayor = num3;
                if (num1 >= num2) {
                    medio = num1;
                    menor = num2;
                } else {
                    medio = num2;
                    menor = num1;
                }
            }   // Mostrar los números ordenados de mayor a menor
            System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + medio + ", " + menor);
            // Cerrar el scanner
        }
    }
}


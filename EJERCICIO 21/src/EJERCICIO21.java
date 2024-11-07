import java.util.Scanner;

public class EJERCICIO21 {

    public static void main(String[] args) {
        // Pedir al usuario que ingrese el número del mes
        try ( // Crear el objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese el número del mes
            System.out.print("Ingresa el número del mes (1-12): ");
            int mes = scanner.nextInt();
            // Llamada al método para determinar los días del mes
            int dias = obtenerDiasDelMes(mes);
            // Mostrar el resultado
            if (dias != -1) {
                System.out.println("El mes " + mes + " tiene " + dias + " días.");
            } else {
                System.out.println("Número de mes inválido.");
            }
            // Cerrar el scanner
        }
    }

    // Método para determinar el número de días en un mes
    public static int obtenerDiasDelMes(int mes) {
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> obtenerDiasDeFebrero();
            default -> -1;
        }; // Enero
        // Marzo
        // Mayo
        // Julio
        // Agosto
        // Octubre
        // Diciembre
        // Abril
        // Junio
        // Septiembre
        // Noviembre
        // Febrero
        // Para febrero, necesitamos saber si el año es bisiesto
        // Si el número del mes es inválido
    }

    // Método que determina los días de febrero (28 o 29 días)
    public static int obtenerDiasDeFebrero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es el año bisiesto? (sí/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("sí") || respuesta.equals("si")) {
            return 29; // Año bisiesto
        } else {
            return 28; // Año no bisiesto
        }
    }
}


package ejercicio.pkg10;

import java.util.Scanner;

public class EJERCICIO10 {

    public static void main(String[] args) {
        // Precios por kilo
        try (Scanner scanner = new Scanner(System.in)) {
            // Precios por kilo
            final double PRECIO_MANZANA = 2.35;
            final double PRECIO_PERA = 1.95;
            // Variables para almacenar las ventas
            double ventasManzanas = 0;
            double ventasPeras = 0;
            // Solicitar ventas para cada semestre
            for (int semestre = 1; semestre <= 2; semestre++) {
                System.out.println("Semestre " + semestre + ":");
                
                System.out.print("Ingrese las ventas de manzanas (en kilos): ");
                ventasManzanas += scanner.nextDouble();
                
                System.out.print("Ingrese las ventas de peras (en kilos): ");
                ventasPeras += scanner.nextDouble();
            }   // Calcular los ingresos
            double totalManzanas = ventasManzanas * PRECIO_MANZANA;
            double totalPeras = ventasPeras * PRECIO_PERA;
            double importeTotal = totalManzanas + totalPeras;
            // Mostrar el resultado
            System.out.printf("Total vendido de manzanas: %.2f kilos (importe: %.2f)\n", ventasManzanas, totalManzanas);
            System.out.printf("Total vendido de peras: %.2f kilos (importe: %.2f)\n", ventasPeras, totalPeras);
            System.out.printf("Importe total anual: %.2f\n", importeTotal);
            // Cerrar el escáner
        }
    }
}

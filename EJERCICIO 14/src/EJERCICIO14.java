import java.util.Scanner;

public class EJERCICIO14 {

    public static void main(String[] args) {
        // Solicitar las notas del primer, segundo y tercer trimestre
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar las notas del primer, segundo y tercer trimestre
            System.out.print("Introduce la nota del primer trimestre: ");
            int nota1 = scanner.nextInt();
            System.out.print("Introduce la nota del segundo trimestre: ");
            int nota2 = scanner.nextInt();
            System.out.print("Introduce la nota del tercer trimestre: ");
            int nota3 = scanner.nextInt();
            // Calcular la media
            double media = (nota1 + nota2 + nota3) / 3.0;
            // Mostrar la media entera (como en el boletín)
            int mediaBoletin = (int) media; // Convierte a entero (solo la parte entera)
            System.out.println("Nota media (boletín): " + mediaBoletin);
            // Mostrar la media con decimales (como en el expediente académico)
            System.out.println("Nota media (expediente académico): " + media);
            // Cerrar el scanner
        }
    }
}


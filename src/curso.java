import java.util.Scanner;

public class curso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar número favorito");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("¡Hola! Espero que tengas un buen día.");
            } else if (opcion == 2) {
                System.out.println("Mi número favorito es el 7.");
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}

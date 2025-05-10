import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = scanner.nextInt();
            System.out.println("Has introducido: " + numero);
        } while (numero >= 0); 

        System.out.println("Fin del programa.");
        scanner.close();
    }
}

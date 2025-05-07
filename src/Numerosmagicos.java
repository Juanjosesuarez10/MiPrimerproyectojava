import java.util.Scanner;

public class Numerosmagicos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = input.nextInt();
        System.out.println("El número es: " + num);

        // Verificar si el número es válido
        if (num <= 0) {
            System.out.println("Número no válido");
        } else {
            // Imprimir los números mágicos
            for (int k = 1; k <= num; k++) {
                for (int j = 1; j <= k; j++) {
                    if (j % 2 == 1) {
                        System.out.print(j); // Imprime números impares
                    } else {
                        System.out.print(k * -j); // Imprime números negativos
                    }
                }
                System.out.println(); // Salto de línea después de cada fila
                input.close();
            }
        }
    }
}

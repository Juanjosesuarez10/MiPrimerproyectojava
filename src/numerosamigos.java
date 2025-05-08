import java.util.Scanner;

public class numerosamigos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el número de inicio:");
        int inicio = input.nextInt();

        System.out.println("Ingresa el número de fin:");
        int fin = input.nextInt();

        if (inicio > fin) {
            System.out.println("Entrada no válida: el número de inicio debe ser menor o igual al de fin.");
            input.close();
            return;
        }

        for (int i = inicio; i <= fin; i++) {
            for (int j = i + 1; j <= fin; j++) {
                if (sonAmigos(i, j)) {
                    System.out.println(i + " y " + j + " son números amigos.");
                }
            }
        }

        input.close();
    }

    public static int sumaDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean sonAmigos(int a, int b) {
        return sumaDivisores(a) == b && sumaDivisores(b) == a;
    }
}

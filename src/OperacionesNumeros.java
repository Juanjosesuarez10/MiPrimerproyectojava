import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos por teclado
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Comparar los números y realizar las operaciones
        if (num1 > num2) {
            // Si el primer número es mayor al segundo, se muestra la suma y la diferencia
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
        } else {
            // Si el segundo número es mayor o igual al primero, se muestra el producto y la división
            if (num2 != 0) {
                double producto = num1 * num2;
                double division = num1 / num2;
                System.out.println("El producto es: " + producto);
                System.out.println("La división es: " + division);
            } else {
                // En caso de que el segundo número sea 0, no se puede realizar la división
                System.out.println("Error: No se puede dividir por cero.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
            scanner.close();
        }
        
    }
}

import java.util.Scanner;

public class ejercicio6 {

       public static void main(String[] args) {
     Scanner scanner= new Scanner (System.in);
     System.out.println("ingrese un numero");
    int numero = scanner.nextInt();
    if (numero >0){
        System.out.println("el numero es positivo");
    } else if (numero <0){
        System.out.println("el numero es negativo");
    } else {
        System.out.println("el numero es cero");
        scanner.close();
    }
}
}
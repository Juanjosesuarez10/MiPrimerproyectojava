 import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      float precio = scanner.nextInt();
      float descuento = 0.20f;
      float precioFinal = (precio*descuento);
      System.out.println("el precio es "+ precioFinal);
      scanner.close();
        }
    }


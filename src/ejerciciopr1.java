import java.util.Scanner;


    public static void main(String[] args) {
        // Crear un array de tamaño 5
        double[] numeros = new double[5];
        double suma = 0;
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Por favor, ingresa 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();  
        }
        
      
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }
        
        // Calcular el promedio
        double promedio = suma / 5;
        
        // Imprimir el resultado
        System.out.println("El promedio de los números es: " + promedio);
        
        scanner.close();  
    


    }

public class ejercicio213 {
    public static void main(String[] args) {
      
        int numero = 5;
        
        System.out.println("Tabla del " + numero + ":");
        
       
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}


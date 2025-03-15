import java.util.Scanner;

public class numerosamigos {

    
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el número de inicio:");
        int inicio = input.nextInt();

        System.out.println("Ingresa el número de fin:");
        int fin = input.nextInt();
        if (inicio>fin){
            System.out.println("entrada no valida");
            input.close();
            boolean encontrado=false;
            for (int i=Math.max(2,inicio);i<6;i++){
            int contadordivisores=0;
            int primerdivisor=0;
            int segundodivisor=0;

     
        for (int i = inicio; i <= fin; i++) {
            
            System.out.println(i);
        }

        
    }
}
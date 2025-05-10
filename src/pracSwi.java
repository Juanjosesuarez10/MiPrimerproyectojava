import java.util.Scanner;

public class pracSwi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dia = scanner.nextInt();
        String nombreDia;
        switch (Dia) {
            case 1: nombreDia = "Lunes";
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miércoles";
                break;
            case 4: nombreDia = "Jueves";
                break;
            case 5: nombreDia = "Viernes";
                break;
            case 6: nombreDia = "Sábado";
                break;
            case 7: nombreDia = "Domingo";
                break;
            default: nombreDia = "Número de día inválido";
                break;

        }
        scanner.close();
        
        System.out.println("El día de la semana seleccionado es: " + nombreDia);
    }
}

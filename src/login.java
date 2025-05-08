import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña = "java123";
        String intento = "";

        while (!intento.equals(contraseña)) {
            System.out.print("Introduce la contraseña: ");
            intento = scanner.nextLine();
        }

        System.out.println("¡Contraseña correcta! Acceso permitido.");
        scanner.close();
    }




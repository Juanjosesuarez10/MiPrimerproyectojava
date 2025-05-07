import java.util.Scanner;

public class stud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escribe algo");
        String algo = scanner.nextLine();
        System.out.println("nombre" + algo);
        scanner.close();
    }
    
}

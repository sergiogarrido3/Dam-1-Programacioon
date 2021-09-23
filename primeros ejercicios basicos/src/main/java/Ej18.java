import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre completo");
        String nombre = sc.nextLine();
        System.out.println("Hola "+nombre.charAt(0));
    }
}

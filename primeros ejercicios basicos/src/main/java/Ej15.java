import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero (A): ");
        int A = sc.nextInt();
        System.out.print("Ingresa un numero (B): ");
        int B = sc.nextInt();
        int Ayuda;

//      CAMBIO DE VARIABLES
        Ayuda = A;
        A = B;
        B = Ayuda;

        System.out.println("A es igual a "+A);
        System.out.println("B es igual a "+B);
    }


}

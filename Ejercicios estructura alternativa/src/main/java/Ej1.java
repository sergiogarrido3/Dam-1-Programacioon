import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.println("Dame 2 numeros: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2)
            System.out.println("El primer numero es mayor que el segundo");
        else
            System.out.println("El primer numero es igual o menor que el segundo");

    }
}

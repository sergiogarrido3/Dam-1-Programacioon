import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        System.out.print("Dame un numero ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num < 0)
            System.out.println("El numero es negativo");

        else if (num > 0)
            System.out.println("El numero es mayor");
        else
            System.out.println("El numero es 0");
    }
}

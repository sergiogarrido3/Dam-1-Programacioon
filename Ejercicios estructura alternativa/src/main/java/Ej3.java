import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.print("Dame un numero ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 ==0)
            System.out.println("El numero es par");
         else
            System.out.println("El numero es impar");


    }
}

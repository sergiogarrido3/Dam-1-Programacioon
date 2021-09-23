import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Dame otro numero");
        int num2 = sc.nextInt();


        System.out.println("Hola "+ nombre +" tu resultado es " + (num1+num2));
                
   
        
        


    }
}


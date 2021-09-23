package Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejerciciosestructurasalternativas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Que ejercio quieres ver? ");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Dame 2 numeros: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (num1 > num2)
                    System.out.println("El primer numero es mayor que el segundo");
                else
                    System.out.println("El primer numero es igual o menor que el segundo");
                break;
            case 2:
                System.out.print("Dame un numero ");
                double num = sc.nextDouble();
                if (num < 0)
                    System.out.println("El numero es negativo");

                else if (num > 0)
                    System.out.println("El numero es positivo");
                else
                    System.out.println("El numero es 0");
                break;
            case 3:
                System.out.print("Dame un numero ");
                num = sc.nextInt();
                if (num % 2 == 0)
                    System.out.println("El numero es par");
                else
                    System.out.println("El numero es impar");
                break;
            case 4:
                System.out.print("Dame dos numeros para dividir ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                if (num2 != 0)
                    System.out.println("La division es: " + num1 / num2);
                else if (num2 == 0)
                    System.out.println("Estas dividiendo entre 0");
                break;
            case 5:
                System.out.print("Dime tu nombre de usuario: ");
                System.out.println("Dime tu contraseña: ");
                String usuario = sc.next();
                String contraseña = sc.next();
                if ((usuario.equals("pepe")) || (contraseña.equals("asdasd")))
                    System.out.println("Has entrado al sistema");
                else
                    System.out.println("Eroor en el sistema");
                break;
            case 6:
                System.out.print("Escribe lo que quieras");
                String cadena = sc.next();
                if (cadena == (cadena.toUpperCase()))
                    System.out.println("Empieza por mayuscula");
                else
                    System.out.println("No empieza por mayuscula");
                break;
            case 7:
                System.out.print("Dame la base y la potecnia: ");
                int base = sc.nextInt();
                int exponente = sc.nextInt();

                if (exponente > 0)
                    System.out.println("El resultado es: " + Math.pow(base, exponente));
                else if (exponente == 0)
                    System.out.println("El resultado es 1");
                else if (exponente < 0)
                    System.out.println("El resultado es " + 1 / (Math.pow(base, Math.abs(exponente))));
                break;
            case 8:
                System.out.print("Nota: ");
                int nota = sc.nextInt();
                System.out.print("Edad :");
                int edad = sc.nextInt();
                System.out.println("Sexo (M) o (F)");
                String sexo = sc.next();
                if ((nota >= 5) && (edad >= 18) && (sexo.equals("F")))
                    System.out.println("Aceptada");
                else if ((nota >= 5) && (edad >= 18) && (sexo.equals("M")))
                    System.out.println("No aceptada ");
            case 9:
                System.out.println("Ingresa tres numeros");
                num = sc.nextInt();
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                if (num >= num1 && num1 >= num2)
                    System.out.println("" + num + "" + num1 + "" + num2);
                else if (num >= num2 && num2 >= num1)
                    System.out.println("" + num + "" + num2 + "" + num1);
                else if (num1 >= num && num >= num2)
                    System.out.println("" + num1 + "" + num + "" + num2);
                else if (num1 >= num2 && num2 >= num)
                    System.out.println("" + num1 + "" + num2 + "" + num);
                else if (num2 >= num && num >= num1)
                    System.out.println("" + num2 + "" + num + "" + num1);
                else
                    System.out.println("" + num2 + "" + num1 + "" + num);
                break;
            case 14:


        }


    }
}

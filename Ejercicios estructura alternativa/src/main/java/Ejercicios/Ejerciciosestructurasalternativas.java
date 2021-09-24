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
                    System.out.println("" + num + "," + num1 + "," + num2);
                else if (num >= num2 && num2 >= num1)
                    System.out.println("" + num + "," + num2 + "," + num1);
                else if (num1 >= num && num >= num2)
                    System.out.println("" + num1 + "," + num + "," + num2);
                else if (num1 >= num2 && num2 >= num)
                    System.out.println("" + num1 + "," + num2 + "," + num);
                else if (num2 >= num && num >= num1)
                    System.out.println("" + num2 + "," + num + "," + num1);
                else
                    System.out.println("" + num2 + "," + num1 + "," + num);
                break;
            case 13:
                System.out.println("Que dia es hoy(dia mes año)");
                int dia = sc.nextInt();
                int mes = sc.nextInt();
                int año = sc.nextInt();
                switch (mes) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia <= 30)
                            System.out.println("La fecha es correcta");
                        else
                            System.out.println("Error la fecha no existe");
                        break;
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (dia <= 31)
                            System.out.println("La fecha es correcta");
                        else
                            System.out.println("Error la fecha no existe");
                        break;
                    case 2:
                        if (dia <= 28)
                            System.out.println("La fecha es correcta");
                        else
                            System.out.println("Error la fecha no existe");

                        break;
                    default:
                        System.out.println("Error la fecha no existe");
                }
                if (año> 5000) {
                    System.out.println("Amigo te adelantaste mucho en el tiempo");
            case 15:
                System.out.print("Cuantos alumnos hay: ");
                int alumnos = sc.nextInt();
                if (alumnos >= 100)
                    System.out.println("El coste del bus seria: " + alumnos * 65 + "€ y cada alumno pagara 65€");
                else if (alumnos <= 99 && alumnos >= 50)
                    System.out.println("El coste del bus seria: " + alumnos * 70 + "€ y cada alumno pagara 70€");
                else if (alumnos <= 49 && alumnos >= 30)
                    System.out.println("El coste del bus seria: " + alumnos * 95 + "€ y cada alumno pagara 95€");
                else
                    System.out.println("El coste del bus seria: 4000€ y cada alumno pagara " + 4000 / alumnos);
                break;
            case 16:
                System.out.print("¿Cuanto tiempo va duro la llamada? ");
                int tiempollamada = sc.nextInt();
                System.out.print("¿Es por la mañana o por la tarde?");
                String horario = sc.next();
                System.out.print("¿Es Domingo si o no?");
                String domingo = sc.next();
                switch (tiempollamada) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        if (domingo.equalsIgnoreCase("si"))
                            System.out.println("El costo de la llamada es " + (100 * tiempollamada * 103) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("mañana") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (100 * tiempollamada * 115) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("tarde") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (100 * tiempollamada * 110) / 100 + "Cents");
                        break;

                    case 6:
                    case 7:
                    case 8:
                        if (domingo.equalsIgnoreCase("si"))
                            System.out.println("El costo de la llamada es " + (80 * tiempollamada * 103) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("mañana") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (80 * tiempollamada * 115) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("tarde") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (80 * tiempollamada * 110) / 100 + "Cents");
                        break;
                    case 9:
                    case 10:
                        if (domingo.equalsIgnoreCase("si"))
                            System.out.println("El costo de la llamada es " + (70 * tiempollamada * 103) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("mañana") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (70 * tiempollamada * 115) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("tarde") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (70 * tiempollamada * 110) / 100 + "Cents");
                        break;
                    default:
                        if (domingo.equalsIgnoreCase("si"))
                            System.out.println("El costo de la llamada es " + (50 * tiempollamada * 103) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("mañana") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (50 * tiempollamada * 115) / 100 + "Cents");
                        else if (horario.equalsIgnoreCase("tarde") && domingo.equalsIgnoreCase("no"))
                            System.out.println("El costo de la llamada es " + (50 * tiempollamada * 110) / 100 + "Cents");
                        break;


                }
            case 17:
                System.out.println("Introduce un numero del dado: ");
                int numerodeldado = sc.nextInt();
                switch (numerodeldado) {
                    case 1:
                        System.out.println("En la cara opuesta esta el numero 6");
                        break;
                    case 2:
                        System.out.println("En la cara opuesta esta el numero 5");
                        break;
                    case 3:
                        System.out.println("En la cara opuesta esta el numero 4");
                        break;
                    case 4:
                        System.out.println("En la cara opuesta esta el numero 3");
                        break;
                    case 5:
                        System.out.println("En la cara opuesta esta el numero 2");
                        break;
                    case 6:
                        System.out.println("En la cara opuesta esta el numero 1");
                        break;
                    default:
                        System.out.println("ERROR: numero incorrecto");
                }
            case 18:


        }
    }
}




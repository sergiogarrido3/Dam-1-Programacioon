import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1,v2,d,difKm,calcH,transfmin;

        System.out.print("Ingrese la velocidad del primer auto(km/h): ");
        v1 = sc.nextInt();
        System.out.print("Ingrese la velocidad del segundo auto(km/h): ");
        v2 = sc.nextInt();
        System.out.print("Ingrese la distancia entre autos(km): ");

     // CALCULO DEL PROBLEMA
        d = sc.nextInt();
        difKm = v2-v1;
        calcH = d / difKm;
        transfmin = calcH * 60;

        System.out.println(transfmin+" min");

    }
}

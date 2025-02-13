package booleans;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a a>0: ");
        int a = sc.nextInt();
        boolean ikkiXonaliJuft = (a>9&&(a%2==0));
        System.out.println("Ikki xonali juft son: "+ikkiXonaliJuft);
    }
}

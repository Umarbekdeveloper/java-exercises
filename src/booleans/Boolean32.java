package booleans;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        System.out.print("Son c: ");
        int c = sc.nextInt();
        boolean shart = (c*c==a*a+b*b);
        System.out.println("To'g'ri burchakli uchburchak: "+shart);
    }
}

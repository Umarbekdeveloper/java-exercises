package booleans;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        boolean shart = (a>2 && b<=3);
        System.out.println("Shart: "+shart);
    }
}

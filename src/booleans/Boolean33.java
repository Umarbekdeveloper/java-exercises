package booleans;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        System.out.print("Son c: ");
        int c = sc.nextInt();
        boolean shart = (a+b>c || b+c>a || a+c>b);
        System.out.println("Uchburchak yasash mumkin: "+shart);
    }
}

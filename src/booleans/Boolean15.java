package booleans;

import java.util.Scanner;

public class Boolean15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        System.out.print("Son c: ");
        int c = sc.nextInt();
        boolean shart = ((a>0 && b>0 && c<0) || (a>0 && b<0 && c>0) ||(a<0 && b>0 && c>0));
        System.out.println("Faqat iktasi musbat: "+shart);
    }
}

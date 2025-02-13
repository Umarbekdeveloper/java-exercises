package booleans;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        boolean shart = (a>=0 && b<-2);
        System.out.println("Shart: "+shart);
    }
}

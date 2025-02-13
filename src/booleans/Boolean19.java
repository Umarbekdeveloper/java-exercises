package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        System.out.print("Son c: ");
        int c = sc.nextInt();
        boolean shart = (a+b==0 || c+b==0 || c+a==0);
        System.out.println("Hech bo'lmaganda ikta son o'zaro qarama-qarshi: "+shart);
    }
}

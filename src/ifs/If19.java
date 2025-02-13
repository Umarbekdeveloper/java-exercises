package ifs;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        System.out.print("Enter number: ");
        int d = scanner.nextInt();
        if (a==b && a==c) {
            System.out.println(d);
        } else if (b==c && b==d) {
            System.out.println(a);
        }else if (c==d && c==a){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}

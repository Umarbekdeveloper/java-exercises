package ifs;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        if (a==b) {
            System.out.println(c);
        } else if (b==c) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}

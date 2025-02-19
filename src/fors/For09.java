package fors;

import java.util.Scanner;

public class For09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a ni kiriting a<b: ");
        double a = scanner.nextDouble();
        System.out.print("b ni kiriting: ");
        double b = scanner.nextDouble();
        double square = 1;
        System.out.println(a+ " dan "+b+" gacha sonlar kvadrati  ");
        for (double i = a; i < b; i++) {
            square = i *i;
            System.out.println(i+" kvadrati = "+square);
        }

    }
}

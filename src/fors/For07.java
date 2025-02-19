package fors;

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a ni kiriting a<b: ");
        double a = scanner.nextDouble();
        System.out.print("b ni kiriting: ");
        double b = scanner.nextDouble();
        double sum = 0;
        for (double i = a; i < b; i++) {
            sum = sum +i;
        }
        System.out.println(a+ " dan "+b+" gacha sonlar yig'indisi = "+sum);
    }
}

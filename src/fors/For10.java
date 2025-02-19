package fors;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting n>0: ");
        double n = scanner.nextDouble();
        double sum = 1;
        for (double i = 1; i <= n; i++) {
            sum =sum+ 1/i;
        }
        System.out.println(" Natija = "+sum);
    }
}

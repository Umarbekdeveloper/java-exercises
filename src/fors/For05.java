package fors;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Narx ni kiriting: ");
        double narx = scanner.nextDouble();
        for (double i = 1; i <= 10; i++) {
            System.out.println(i/10+" kg = "+i/10*narx+" so'm");
        }
    }
}

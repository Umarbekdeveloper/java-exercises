package fors;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Narx ni kiriting: ");
        double narx = scanner.nextDouble();
        for (double i = 12; i <= 20; i+=2) {
            System.out.println(i/10+" kg = "+i/10*narx+" so'm");
        }
    }
}

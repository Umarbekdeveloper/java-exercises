package fors;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("k ni kiriting: ");
        int k = scanner.nextInt();
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(k+" ");
        }
    }
}

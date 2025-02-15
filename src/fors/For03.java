package fors;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a ni kiriting a>b: ");
        int a = scanner.nextInt();
        System.out.print("b ni kiriting: ");
        int b = scanner.nextInt();
        int count = 0;
        for (int i = b-1; i > a; i--) {
            System.out.print(i+" ");
            count++;
        }
        System.out.print("Soni >>> "+count);
    }
}

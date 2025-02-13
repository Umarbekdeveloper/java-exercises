package ifs;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        if (a>b && a>c && b>c){
            System.out.println("Eng kattas iktasini yigindisi >>"+(a+b));
        }
        if (b>a && b>c && c>a) {
            System.out.println("Eng kattas iktasini yigindisi >>"+(c+b));
        }
        if (c>a && c>b && a>b){
            System.out.println("Eng kattas iktasini yigindisi >>"+(a+c));
        }
    }
}

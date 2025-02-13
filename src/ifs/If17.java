package ifs;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        if (a>b && a>c && b>c){
            System.out.println("a >>"+(a*2));
            System.out.println("b >>"+(b*2));
            System.out.println("c >>"+(c*2));
        }
        if (a<b && a<c && b<c){
            System.out.println("a >>"+(a*2));
            System.out.println("b >>"+(b*2));
            System.out.println("c >>"+(c*2));
        }else {
            System.out.println("a >>"+(a*(-1)));
            System.out.println("b >>"+(b*(-1)));
            System.out.println("c >>"+(c*(-1)));
        }
    }
}

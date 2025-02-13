package ifs;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("Kattasi>>> "+a+" va kichigi >>> "+b);
        }else {
            System.out.println("Kattasi>>> "+b+" va kichigi >>> "+a);
        }
    }
}

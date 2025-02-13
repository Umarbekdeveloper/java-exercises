package ifs;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        if (a<b && a<c){
            System.out.println("Eng kichigi a>>"+a);
        } else if (b<a && b<c) {
            System.out.println("Eng kichigi b>>"+b);
        }else{
            System.out.println("Eng kichigi c>>"+c);
        }
    }
}

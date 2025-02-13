package ifs;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        if (a==b){
            System.out.println("a >>> "+(a=0)+" va  b >>> "+(b=0));
        }else {
            System.out.println("a >>> "+(a+b)+" va  b >>> "+(b+a));
        }
    }
}

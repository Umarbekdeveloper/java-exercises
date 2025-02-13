package ifs;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        int c = Math.min(a,b);
        if (a>b){
            System.out.println("Kattasi b = "+(b=a));
            a=c;
            System.out.println("Kichigi a = "+a);
        }else{
            System.out.println("Kattasi b = "+(b));
            System.out.println("Kichigi a = "+a);
        }
    }
}

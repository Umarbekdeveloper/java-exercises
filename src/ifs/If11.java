package ifs;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        int maxSon = Math.max(a,b);
        if (a==b){
            System.out.println("a >>> "+(a=0)+" va  b >>> "+(b=0));
        }else {
            System.out.println("a >>> "+(a=maxSon)+" va  b >>> "+(b=maxSon));
        }
    }
}

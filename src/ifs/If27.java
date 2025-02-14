package ifs;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double x = scanner.nextDouble();
        if (x<0) {
            System.out.print("f(x) = "+(0));
        }
        if (x>=0 && x<1){
            System.out.print("f(x) = "+(x*x));
        }
        if (x>=2){
            System.out.print("f(x) = "+4);
        }
    }
}

package ifs;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double x = scanner.nextDouble();
        if (x>2 || x<-2) {
            System.out.print("f(x) = "+(2*x));
        }else {
            System.out.print("f(x) = "+(-3*x));
        }
    }
}

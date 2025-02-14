package ifs;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double x = scanner.nextDouble();
        double f;
        if (x>0) {
            System.out.print("f(x) = "+(2*Math.sin(x)));
        }
        if (x<=0){
            System.out.print("f(x) = "+(x-6));
        }
    }
}

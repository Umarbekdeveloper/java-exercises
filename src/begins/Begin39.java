package begins;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A A teng emas 0 ga: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        System.out.print("C: ");
        int C = sc.nextInt();
        double x1 = (-B-Math.sqrt(B*B-4*A*C))/2*A;
        double x2 = (-B+Math.sqrt(B*B-4*A*C))/2*A;
        System.out.println("Tenglamani yechimi: "+x1);
        System.out.println("Tenglamani yechimi: "+x2);
    }
}

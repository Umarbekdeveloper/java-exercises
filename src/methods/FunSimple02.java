package methods;

import java.util.Scanner;

public class FunSimple02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a,b,c haqiqiy sonlarni kiriting:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("A soni uchun:");
        powerA234(a);

        System.out.println("B soni uchun:");
        powerA234(b);

        System.out.println("C soni uchun:");
        powerA234(c);
    }

    public static void powerA234(double num) {
        double power2 = Math.pow(num,2);
        double power3 = Math.pow(num,3);
        double power4 = Math.pow(num,4);
        System.out.println(num + " ning 2-darajasi: " + power2);
        System.out.println(num + " ning 3-darajasi: " + power3);
        System.out.println(num + " ning 4-darajasi: " + power4);
    }
}

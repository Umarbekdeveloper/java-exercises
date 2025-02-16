package methods;

import java.util.Scanner;

public class FunSimple01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a,b,c haqiqiy sonlarni kiriting:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("d,e butun sonlarni kiriting:");
        int d = sc.nextInt();
        int e = sc.nextInt();
        double resultA = PowerA3(a);
        double resultB = PowerA3(b);
        double resultC = PowerA3(c);
        double resultD = PowerA3(d);
        double resultE = PowerA3(e);
        System.out.println(a + " ning 3-darajasi: " + resultA);
        System.out.println(b + " ning 3-darajasi: " + resultB);
        System.out.println(c + " ning 3-darajasi: " + resultC);
        System.out.println(d + " ning 3-darajasi: " + resultD);
        System.out.println(e + " ning 3-darajasi: " + resultE);
    }

    public static double PowerA3 (double num){
        return Math.pow(num,3);
    }
}

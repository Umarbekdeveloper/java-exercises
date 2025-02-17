package methods;

import java.util.Scanner;

public class FunSimple06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sonlarni kiriting:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+" sonining: ");
        DigitCountSum(a);
        System.out.println();
        System.out.println(b+" sonining: ");
        DigitCountSum(b);
        System.out.println();
        System.out.println(c+" sonining: ");
        DigitCountSum(c);
}

    public static void DigitCountSum(int num) {
        int count = 0;
        int digitSum = 0;
        int son;
        for (int i = 0; i < num; i++) {
            son=num%10;
            digitSum +=son;
            count++;
            num/=10;
        }
        System.out.println("Raqamlari yig'indisi: "+digitSum);
        System.out.println("Raqamlari soni: "+count);
    }
}

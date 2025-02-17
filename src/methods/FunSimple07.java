package methods;

import java.util.Scanner;

public class FunSimple07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sonlarni kiriting:");
        int a = 987;
//        int b = sc.nextInt();
//        int c = sc.nextInt();
        System.out.println(a+" sonining: ");
        int result = InvertDigit(a);
        System.out.println(result);
//        System.out.println();
//        System.out.println(b+" sonining: ");
//        DigitCountSum(b);
//        System.out.println();
//        System.out.println(c+" sonining: ");
//        DigitCountSum(c);
}

    public static int InvertDigit(int num) {
        int son=0;
        while (num>0){
            son =num%10;
            num/=10;
        }
        return son;
    }
}

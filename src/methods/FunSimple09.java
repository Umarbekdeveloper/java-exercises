package methods;

import java.util.Scanner;

public class FunSimple09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("K sonini kiriting:");
        int K = sc.nextInt();
        System.out.println("R sonini kiriting 1<=R<=9:");
        int R = sc.nextInt();
        int result = AddLeftDigit(K,R);
        System.out.println("Yangi son : "+result);
}

    public static int AddLeftDigit(int K, int R) {
      return 0;
    }
}

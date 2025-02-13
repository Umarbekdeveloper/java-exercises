package begin;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A ni kiriti: ");
        int A = sc.nextInt();
        System.out.println("A^2 = "+Math.pow(A,2));
        System.out.println("A^4 = "+Math.pow(A,4));
        System.out.println("A^8 = "+Math.pow(A,8));
    }
}

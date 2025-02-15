package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A ni kiriti: ");
        int A = sc.nextInt();
        System.out.println("A^2 = "+Math.pow(A,2));
        System.out.println("A^3 = "+Math.pow(A,4));
        System.out.println("A^5 = "+Math.pow(A,8));
    }
}

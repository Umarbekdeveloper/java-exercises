package integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A A>B: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        int joylashishSoni = A/B;
        int qolgani = B- A%B;
        System.out.println(joylashishSoni+" marta joylashadi");
        System.out.println(qolgani+" joylashmagan qismi");
    }
}

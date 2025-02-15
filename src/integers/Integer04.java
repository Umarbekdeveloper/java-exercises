package integers;

import java.util.Scanner;

public class Integer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A A>B: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        int joylashishSoni = A/B;
        System.out.println(joylashishSoni+" marta joylashadi");
    }
}

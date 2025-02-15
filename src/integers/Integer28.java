package integers;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("K 1<K<365: ");
        int k = sc.nextInt();
        System.out.print("N 1<=N<=7: ");
        int n = sc.nextInt();
        int day = (k-1)%7+n;
        System.out.println("Hafta kunining raqami: "+day);
    }
}

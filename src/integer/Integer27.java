package integer;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("K 1<K<365: ");
        int k = sc.nextInt();
        int day = (k+6)%7+1;
        System.out.println("Hafta kunining raqami: "+day);
    }
}

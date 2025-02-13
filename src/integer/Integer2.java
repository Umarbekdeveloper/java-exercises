package integer;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilogramni kiriting: ");
        int M = sc.nextInt();
        System.out.println(M+" kg "+" to'liq "+M/1000+" t bo'ladi");
    }
}

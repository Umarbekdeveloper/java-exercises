package begin;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuqtalar X1,X2 ");
        int X1 = sc.nextInt();
        int X2 = sc.nextInt();
        int masofa = Math.abs(X1-X2);
        System.out.println("Masofa = "+masofa);
    }
}

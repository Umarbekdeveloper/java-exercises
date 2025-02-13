package begin;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonlarni kiriting: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double geometrigi = Math.sqrt(a*b);
        System.out.println("O'rta geometrigi = "+geometrigi);
    }
}

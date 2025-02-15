package begins;

import java.util.Scanner;


public class Begin08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonlarni kiriting: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("O'rta arifmetigi = "+(a+b)/2);
    }
}

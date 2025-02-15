package begins;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A ni kirit: ");
        int a= sc.nextInt();
        System.out.print("B ni kirit: ");
        int b= sc.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}

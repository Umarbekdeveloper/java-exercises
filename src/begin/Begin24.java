package begin;

import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a= sc.nextInt();
        System.out.print("B: ");
        int b= sc.nextInt();
        System.out.print("C: ");
        int c= sc.nextInt();
        int d = a;
        a=c;
        c=b;
        b=d;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }
}

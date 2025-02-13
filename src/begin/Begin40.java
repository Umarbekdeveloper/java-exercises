package begin;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A1 A teng emas 0 ga: ");
        int A1 = sc.nextInt();
        System.out.print("B1: ");
        int B1 = sc.nextInt();
        System.out.print("C1: ");
        int C1 = sc.nextInt();
        System.out.print("A2 A teng emas 0 ga: ");
        int A2 = sc.nextInt();
        System.out.print("B2: ");
        int B2 = sc.nextInt();
        System.out.print("C2: ");
        int C2 = sc.nextInt();
        int x =(C1*B2-C2*B1)/(A1*B2-A2*B1);
        int y =(A1*C2-A2*C1)/(A1*B2-A2*B1);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}

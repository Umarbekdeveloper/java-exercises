package begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 ni kiriti: ");
        int x1 = sc.nextInt();
        System.out.print("x2 ni kiriti: ");
        int x2 = sc.nextInt();
        System.out.print("y1 ni kiriti: ");
        int y1 = sc.nextInt();
        System.out.print("y2 ni kiriti: ");
        int y2 = sc.nextInt();
        int a = x2-x1;
        int b = y2-y1;
        int area=a*b;
        int peremetr=2*(a+b);
        System.out.println("Area = "+area);
        System.out.println("Perimetri = "+peremetr);
    }
}

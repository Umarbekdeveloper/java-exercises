package booleans;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son x1 1<=son<=8: ");
        int x1 = sc.nextInt();
        System.out.print("Son y1 1<=son<=8: ");
        int y1 = sc.nextInt();
        System.out.print("Son x2 1<=son<=8: ");
        int x2 = sc.nextInt();
        System.out.print("Son y2 1<=son<=8: ");
        int y2 = sc.nextInt();
        boolean shart = (x1+y1)==(x2+y2);
        System.out.println("Berilgan nuqtadagi maydonlar bir xil: "+shart);
    }
}

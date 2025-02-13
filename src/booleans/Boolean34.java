package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son x: ");
        int x = sc.nextInt();
        System.out.print("Son y: ");
        int y = sc.nextInt();
        boolean shart = (x+y)%2==1;
        System.out.println("Berilgan nuqtadagi maydon oq: "+shart);
    }
}

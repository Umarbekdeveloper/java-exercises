package booleans;

import java.util.Scanner;

public class Boolean27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son x: ");
        int x = sc.nextInt();
        System.out.print("Son y: ");
        int y = sc.nextInt();
        boolean shart = (x<0 && y>0) || (x<0 && y<0);
        System.out.println("Nuqtalar koordinata o'qining 2-choragida yoki 3-choragida: "+shart);
    }
}

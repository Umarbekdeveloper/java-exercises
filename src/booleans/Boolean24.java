package booleans;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a>0: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        System.out.print("Son c: ");
        int c = sc.nextInt();
        boolean shart = (b*b-4*a*c)>0;
        System.out.println("Kvadrat tenglama 2 ta yechimga ega2: "+shart);
    }
}

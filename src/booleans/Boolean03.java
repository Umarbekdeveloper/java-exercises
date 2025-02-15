package booleans;

import java.util.Scanner;

public class Boolean03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Son: ");
        int a = sc.nextInt();
        boolean juft = (a%2==0);
        System.out.println("A soni juft: "+juft);
    }
}

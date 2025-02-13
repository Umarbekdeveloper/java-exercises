package booleans;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a>99: ");
        int a = sc.nextInt();
        int birlar=a%10;
        int onlar=a/10%10;
        int yuzlar=a/100;
        boolean shart = (birlar==yuzlar);
        System.out.println("Sonni chapdan yoki o'ngdan o'qisa bir xil: "+shart);
    }
}

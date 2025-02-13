package booleans;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a>99: ");
        int a = sc.nextInt();
        int birlar=a%10;
        int onlar=a/10%10;
        int yuzlar=a/100;
        boolean shart = (birlar!=onlar && yuzlar!=onlar);
        System.out.println("Sonning barcha raqamlari xar xil: "+shart);
    }
}

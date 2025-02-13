package booleans;

import java.util.Scanner;

public class Boolean21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a>99: ");
        int a = sc.nextInt();
        int birlar=a%10;
        int onlar=a/10%10;
        int yuzlar=a/100;
        boolean shart = (birlar-onlar==onlar-yuzlar);
        System.out.println("Sonning barcha raqamlari ketma-ket o'suvchi: "+shart);
    }
}

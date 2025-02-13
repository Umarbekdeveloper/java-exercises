package booleans;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a a>0: ");
        int a = sc.nextInt();
        boolean uchXonaliToq = (a>99&&(a%2==1));
        System.out.println("Uch xonali toq son: "+uchXonaliToq);
    }
}

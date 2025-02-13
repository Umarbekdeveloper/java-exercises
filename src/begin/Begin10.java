package begin;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonlarni kiriting: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Yigindisi = "+(a+b)+", Ko'paytmasi = "+ a*b +", Kvadrati a= "+Math.pow(a,2)+", Kvadrati b= "+Math.pow(b,2));
    }
}

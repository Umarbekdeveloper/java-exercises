package begins;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonlarni kiriting: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Yigindisi = "+(a+b)+", Ko'paytmasi = "+ a*b +", Moduli a= "+Math.abs(a)+", Moduli b= "+Math.abs(b));
    }
}

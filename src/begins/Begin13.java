package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radiuslari (R1>R2): ");
        int R1 = sc.nextInt();
        int R2 = sc.nextInt();
        final double pi = 3.14;
        double S1 = pi*R1;
        double S2 = pi*R2;
        double S3 = pi*(R1-R2);
        System.out.println("S1 = "+S1+" S2 = "+S2+" S3 = "+S3);
    }
}

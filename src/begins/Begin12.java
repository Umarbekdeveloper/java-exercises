package begins;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Katetlari: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double gipotenuzasi = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double peremetri = a+b+gipotenuzasi;
        System.out.println("Gipotenuzasi = "+gipotenuzasi+", Peremetri = "+peremetri);
    }
}

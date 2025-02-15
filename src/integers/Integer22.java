package integers;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sekund: ");
        int sekund = sc.nextInt();
        int soat = sekund/3600;
        sekund-=(soat*3600);
        System.out.println(soat+" soat "+" va "+sekund+" sekund o'tdi.");
    }
}

package integers;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sekund: ");
        int sekund = sc.nextInt();
        int soat = sekund/3600;
        sekund-=(soat*3600);
        int minut = sekund/60;
        sekund-=(minut*60);
        System.out.println(soat+" soat, "+minut+" minut "+" va "+sekund+" sekund o'tdi.");
    }
}

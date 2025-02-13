package integer;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sekund: ");
        int sekund = sc.nextInt();
        int minut = sekund/60;

        System.out.println("Minut = "+minut);
    }
}

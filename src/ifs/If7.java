package ifs;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        int minNumber = Math.min(a,b);
        if (minNumber>0 && minNumber<10){
            System.out.println(minNumber+" ning tartib raqami >>> "+1);
        }
        if (minNumber>9 && minNumber<100){
            System.out.println(minNumber+" ning tartib raqami >>> "+2);
        }

    }
}

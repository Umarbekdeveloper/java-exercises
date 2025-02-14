package ifs;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        double year = scanner.nextDouble();
        if ((year%4==0 && year%100!=0) || year%400==0) {
            System.out.println(year+" Kabisa yili, 366 kuun bor");
        }else {
            System.out.println(year+" Kabisa yilimas, 365 kun bor");
        }
    }
}

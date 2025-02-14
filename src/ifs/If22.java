package ifs;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scanner.nextInt();
        System.out.print("Enter number: ");
        int y = scanner.nextInt();
        if (x>0 && y>0) {
            System.out.println("Birinchi chorakda");
        } else if (x<0 && y>0) {
            System.out.println("Ikkinchi chorakda");
        }else if (x<0 && y<0){
            System.out.println("Uchinchi chorakda");
        }else {
            System.out.println("To'rtinchi chorakda");
        }
    }
}

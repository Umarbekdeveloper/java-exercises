package ifs;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter number: ");
        int b = scanner.nextInt();
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        int countMusbat=0;
        int countManfiy=0;
        if (a>0){
            countMusbat++;
        }else {
            countManfiy++;
        }
        if (b>0) {
            countMusbat++;
        }else {
            countManfiy++;
        }
        if (c>0){
            countMusbat++;
        }else {
            countManfiy++;
        }
        System.out.println(countMusbat+" ta musbat son bor va "+countManfiy+" ta manfiy son bor.");
    }
}

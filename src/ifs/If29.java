package ifs;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number<0 && number%2==0) {
            System.out.println(number+" manfiy, juft son");
        }else if (number<0 && number%2==-1){
            System.out.println(number+" manfiy, toq son");
        }else if (number>0 && number%2==1){
            System.out.println(number+" musbat, toq son");
        }else if (number>0 && number%2==0){
            System.out.println(number+" musbat, juft son");
        }else {
            System.out.println(number+" nol");
        }
    }
}

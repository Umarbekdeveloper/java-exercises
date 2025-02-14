package ifs;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1<number<999: ");
        int number = scanner.nextInt();
        if (number<9 && number%2==0) {
            System.out.println(number+" bir xonali juft son");
        }else if (number<9 && number%2==1) {
            System.out.println(number+" bir xonali toq son");
        }else if (number<100 && number%2==1) {
            System.out.println(number+" ikki xonali toq son");
        }else if (number<100 && number%2==0) {
            System.out.println(number+" ikki xonali juft son");
        }else if (number>99){
            if (number%2==0){
                System.out.println(number+" uch xonali juft son");
            }else {
                System.out.println(number+" uch xonali toq son");
            }
        }
    }
}

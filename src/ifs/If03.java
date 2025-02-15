package ifs;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        if (a>0){
            System.out.println("Son musbat: "+(a+=1));
        } else if (a==0) {
            System.out.println("Son nolga teng: "+(a+10));
        } else{
            System.out.println("Son manfiy: "+(a-2));
        }
    }
}

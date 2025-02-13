package booleans;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son a: ");
        int a = sc.nextInt();
        System.out.print("Son b: ");
        int b = sc.nextInt();
        boolean shart = ((a%2>0 && !(b%2>0))||(b%2>0 && !(a%2>0)));
        System.out.println("a va b sonlarni faqat bittasi toq son: "+shart);
    }
}

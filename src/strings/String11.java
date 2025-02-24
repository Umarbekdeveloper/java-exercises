package strings;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satrni kiriting: ");
        String str = sc.next();
        String newStr = str.replace('s', ' ');
        System.out.println(newStr);


    }
}

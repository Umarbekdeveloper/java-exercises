package strings;

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satrni kiriting: ");
        String str1 = sc.next();
        System.out.print("Satrni kiriting: ");
        String str2 = sc.next();
        System.out.println(str1.concat(str2));


    }
}

package strings;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satrni kiriting: ");
        String str = sc.next();
        String teskariStr = new StringBuilder(str).reverse().toString();
        System.out.println(teskariStr);


    }
}

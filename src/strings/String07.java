package strings;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satrni kiriting: ");
        String str = sc.next();
        System.out.println("Birinchi harfi: "+str.substring(0,1));
        System.out.println("Oxirgi harfi: "+str.substring(str.length()-1));
    }
}

package strings;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Belgini kiriting: ");
        char belgi = sc.next().charAt(0);
        System.out.println("Belgidan oldingi: "+(char)(belgi-1));
        System.out.println("Belgi: "+belgi);
        System.out.println("Belgidan keyingisi: "+(char)(belgi+1));
    }
}

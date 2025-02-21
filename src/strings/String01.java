package strings;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Belgini kiriting: ");
        char belgi = sc.next().charAt(0);
        System.out.println("Belgining kodi: "+(int) belgi);
    }
}

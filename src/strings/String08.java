package strings;

import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n kiriting: ");
        int n = sc.nextInt();
        System.out.print("Belgini kiriting: ");
        char belgi = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            System.out.print(belgi);
        }
    }
}

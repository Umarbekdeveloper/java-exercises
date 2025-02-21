package strings;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n kiriting 1<= n <= 26: ");
        int n = sc.nextInt();
        for (int i = 65; i <= 65+n; i++) {
            System.out.println(i+" - sondagi belgi: "+(char) i);
        }
    }
}

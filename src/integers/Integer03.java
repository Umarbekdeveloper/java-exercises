package integers;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hajmini baytda kiriting: ");
        int B = sc.nextInt();
        System.out.println(B+" bayt "+" to'liq "+B/1024+" KB bo'ladi");
    }
}

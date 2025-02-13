package begin;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuqtalar A,B,C ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int AC = Math.abs(C-A);
        int BC = Math.abs(C-B);
        System.out.println("AC = "+AC+" BC = "+BC+" Yig'indisi = "+(AC+BC));
    }
}

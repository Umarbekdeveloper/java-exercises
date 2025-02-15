package integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son > 999: ");
        int son = sc.nextInt();
        int minglar = son/1000%10;

        System.out.println("Minglar xonasidagi son = "+minglar);
    }
}

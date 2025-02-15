package integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son > 999: ");
        int son = sc.nextInt();
        int yuzlik = son/100%10;

        System.out.println("Yuzlik xonasidagi son = "+yuzlik);
    }
}

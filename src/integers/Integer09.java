package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son: ");
        int son = sc.nextInt();
        int yuzlar = son/100;
        System.out.println("Yuzlar xonasidagi son >> "+yuzlar);
    }
}

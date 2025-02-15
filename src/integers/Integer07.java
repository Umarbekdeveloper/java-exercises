package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son: ");
        int son = sc.nextInt();
        int onlik = son/10;
        int birlik = son%10;

        System.out.println("Raqamlari yig'indisi>>> "+(onlik+birlik));
    }
}

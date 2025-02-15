package integers;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son: ");
        int son = sc.nextInt();
        int yuzlik = son/100;
        int onlik = son/10%10;
        int birlik = son%10;

        System.out.println("Yangi son = "+yuzlik+birlik+onlik);
    }
}

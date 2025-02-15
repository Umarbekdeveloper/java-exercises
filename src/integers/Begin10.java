package integers;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son: ");
        int son = sc.nextInt();
        int onlik = son/10%10;
        int birlik = son%10;

        System.out.println(son+" birlik xonasidagi raqam >>"+birlik+" O'nlik xonasidagi raqam >>"+onlik);
    }
}

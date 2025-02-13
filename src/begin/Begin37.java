package begin;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("V1 1-avtomobil tezligi: ");
        int v1 = sc.nextInt();
        System.out.print("V2 2-avtomobil tezligi: ");
        int v2 = sc.nextInt();
        System.out.print("t vaqt: ");
        int t = sc.nextInt();
        System.out.print("S ular orasidagi umumiy masofa: ");
        int s = sc.nextInt();
        int s1 =(v1*t+v2*t);
        System.out.println("Ular orasida qolgan yo'li: "+(s-s1));
    }
}

package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("V qayiq tezligi: ");
        int v = sc.nextInt();
        System.out.print("U qayiq tezligi U<V: ");
        int u = sc.nextInt();
        System.out.print("t1 oqim boylab: ");
        int t1 = sc.nextInt();
        System.out.print("t2 oqim qarshi: ");
        int t2 = sc.nextInt();
        int s1=(v+u)*t1;
        int s2=(v-u)*t2;
        int s=s1+s2;
        System.out.println("Oqim bo'ylab bosib o'tgan yo'li: "+s1);
        System.out.println("Oqim qarshi bosib o'tgan yo'li: "+s2);
        System.out.println("Qayiqni umumiy bosib o'tgan yo'li: "+s);
    }
}

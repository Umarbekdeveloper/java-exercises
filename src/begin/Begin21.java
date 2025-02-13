package begin;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuqtalar A<C>B ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double masofa = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Masofa = "+masofa);
    }
}

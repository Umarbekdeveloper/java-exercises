package begins;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x= sc.nextInt();
        double y = 4*Math.pow((x-3),6)-6*Math.pow((x-3),3)+2;
        System.out.println("y = "+y);
    }
}

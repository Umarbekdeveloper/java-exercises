package begins;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x= sc.nextInt();
        double y = 3*Math.pow(x,6)-3*Math.pow(x,2)-7;
        System.out.println("y = "+y);
    }
}

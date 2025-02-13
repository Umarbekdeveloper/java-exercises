package begin;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Burchakni gradianlarda kiriting: ");
        double garadian = scanner.nextDouble();
        double radian = garadian * (Math.PI / 180);
        System.out.println("Burchak garadianda: " + radian);
    }
}

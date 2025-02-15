package begins;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Burchakni radianlarda kiriting: ");
        double radian = scanner.nextDouble();
        double garadian = radian * (180 / Math.PI);
        System.out.println("Burchak garadianda: " + garadian);
    }
}

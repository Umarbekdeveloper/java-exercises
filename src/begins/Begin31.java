package begins;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperaturani kiriting: ");
        double frangeyt = scanner.nextDouble();
        double gradus = (frangeyt-32)*5/9;
        System.out.println("Gradusda: " + gradus);
    }
}

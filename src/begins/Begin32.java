package begins;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperaturani kiriting: ");
        double gradus = scanner.nextDouble();
        double frangeyt = (gradus*9/5)+32;
        System.out.println("Gradusda: " + frangeyt);
    }
}

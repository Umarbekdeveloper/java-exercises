package begins;

import java.util.Scanner;

public class Begin01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadrat tomoni a: ");
        double a = scanner.nextDouble();
        double P = 4*a;
        System.out.println("Perimetri: "+P);
    }
}

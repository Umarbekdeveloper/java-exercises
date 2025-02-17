package methods;

import java.util.Scanner;

public class FunSimple04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teng tomonli uchburchakning tomonlarini kiriting:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("A,B,C  tomonli 3 ta uchburchak uchun:");
        Triangle(a,b,c);

    }

    public static void Triangle(double num1,double num2, double num3) {
        double area1 = (Math.sqrt(3)/4)*num1*num1;
        double area2 = (Math.sqrt(3)/4)*num2*num2;
        double area3 = (Math.sqrt(3)/4)*num3*num3;
        double perimetr1 = 3*num1;
        double perimetr2 = 3*num2;
        double perimetr3 = 3*num3;

        System.out.println(num1+" tomonli uchburchakning yuzasi = " + area1+" Perimetri = "+perimetr1);
        System.out.println(num2+" tomonli uchburchakning yuzasi = " + area2+" Perimetri = "+perimetr2);
        System.out.println(num3+" tomonli uchburchakning yuzasi = " + area3+" Perimetri = "+perimetr3);
    }
}

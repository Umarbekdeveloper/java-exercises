package methods;

import java.util.Scanner;

public class FunSimple03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a,b,c,d haqiqiy sonlarni kiriting:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("A , B, C va D soni uchun:");
        MEAN(a,b,c,d);

//        System.out.println("A va D soni uchun:");
//        MEAN(a,c);
//
//        System.out.println("A va C soni uchun:");
//        MEAN(a,d);

    }

    public static void MEAN(double num1,double num2, double num3, double num4) {
        double MeanAB = (num1+num2)/2;
        double MeanAC = (num1+num3)/2;
        double MeanAD = (num1+num4)/2;
        double Meanab = Math.sqrt(num1*num2);
        double Meanac = Math.sqrt(num1*num3);
        double Meanad = Math.sqrt(num1*num4);
        System.out.println(num1+" va "+num2 + " ning o'rta arifmetigi " + MeanAB);
        System.out.println(num1+" va "+num3 + " ning o'rta arifmetigi " + MeanAC);
        System.out.println(num1+" va "+num4 + " ning o'rta arifmetigi " + MeanAD);

        System.out.println(num1+" va "+num2 + " ning o'rta geometrigi " + Meanac);
        System.out.println(num1+" va "+num3 + " ning o'rta geometrigi " + Meanab);
        System.out.println(num1+" va "+num4 + " ning o'rta geometrigi " + Meanad);
    }
}

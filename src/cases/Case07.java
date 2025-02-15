package cases;

import java.util.Scanner;

public class Case07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1<=k<=5: ");
        int amal = sc.nextInt();
        System.out.print("Kesma: ");
        int ogirlik = sc.nextInt();
        switch (amal){
            case 1 -> System.out.println(ogirlik+" kilogram = "+(ogirlik)+" kilogram");
            case 2 -> System.out.println(ogirlik+" milligram = "+(ogirlik/10000)+" kilogram");
            case 3 -> System.out.println(ogirlik+" gram = "+(ogirlik/1000)+" kilogram");
            case 4 -> System.out.println(ogirlik+" tonna = "+(ogirlik*1000)+" kilogram");
            case 5 -> System.out.println(ogirlik+" sentner = "+(ogirlik*100)+" kilogram");
            default -> System.out.println("Amal xato!!");
        }
    }
}

package cases;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1<=k<=5: ");
        int amal = sc.nextInt();
        System.out.print("Kesma: ");
        int kesma = sc.nextInt();
        switch (amal){
            case 1 -> System.out.println(kesma+" detsimetr = "+(kesma/10)+" metr");
            case 2 -> System.out.println(kesma+" kilometr = "+(kesma*1000)+" metr");
            case 3 -> System.out.println(kesma+" metr = "+(kesma)+" metr");
            case 4 -> System.out.println(kesma+" millimetr = "+(kesma/1000)+" metr");
            case 5 -> System.out.println(kesma+" santimetr = "+(kesma/100)+" metr");
            default -> System.out.println("Amal xato!!");
        }
    }
}

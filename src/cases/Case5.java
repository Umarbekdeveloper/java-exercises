package cases;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1<=k<=4: ");
        int amal = sc.nextInt();
        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        switch (amal){
            case 1 -> System.out.println("a+b = "+(A+B));
            case 2 -> System.out.println("a-b = "+(A-B));
            case 3 -> System.out.println("a/b = "+(A/B));
            case 4 -> System.out.println("a*b = "+(A*B));
            default -> System.out.println("Amal xato!!");
        }
    }
}

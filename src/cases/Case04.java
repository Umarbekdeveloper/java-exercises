package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1<=k<=12: ");
        int k = sc.nextInt();
        switch (k) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu oyda 31 kun bor ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu oyda 30 kun bor ");
                break;
            case 2:
                System.out.println("Bu oyda 28 yoki 29 kun bor ");
                break;
        }
    }
}

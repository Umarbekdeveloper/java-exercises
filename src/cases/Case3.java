package cases;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1<=k<=12: ");
        int k = sc.nextInt();
        switch (k) {
            case 1:
            case 2:
            case 12:
                System.out.println("Qish");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Bahaor");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yoz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Kuz");
                break;
        }
    }
}

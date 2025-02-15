package cases;

import java.util.Scanner;

public class Case08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kabisa bo'lmagan yil oy sanasi kiritilsin!!");
        System.out.print("Kunni kiriting (1-31): ");
        int D = scanner.nextInt();
        System.out.print("Oyni kiriting (1-12): ");
        int M = scanner.nextInt();
        switch (M) {
            case 1 -> System.out.println(D+" - "+"yanvar");
            case 2 ->System.out.println(D+" - "+"fevral");
            case 3 ->System.out.println(D+" - "+"mart");
            case 4 ->System.out.println(D+" - "+"aprel");
            case 5 ->System.out.println(D+" - "+"may");
            case 6 ->System.out.println(D+" - "+"iyun");
            case 7 ->System.out.println(D+" - "+"iyul");
            case 8 ->System.out.println(D+" - "+"avgust");
            case 9 ->System.out.println(D+" - "+"sentyabr");
            case 10 ->System.out.println(D+" - "+"oktyabr");
            case 11 ->System.out.println(D+" - "+"noyabr");
            case 12 ->System.out.println(D+" - "+"dekabr");
            default -> System.out.println("Noto'g'ri oy kiritildi!");
        }
    }
}

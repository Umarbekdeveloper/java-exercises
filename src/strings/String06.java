package strings;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Belgini kiriting: ");
        char belgi = sc.next().charAt(0);
        if (Character.isDigit(belgi)){
            System.out.println(belgi+" digit");
        } else if (Character.isLetter(belgi)) {
            System.out.println(belgi+" letter");
        }else {
            System.out.println(" nol");
        }
    }
}

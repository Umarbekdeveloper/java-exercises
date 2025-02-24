package arrays;

import java.util.Scanner;

public class Array016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n n>0:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arrayni umumiy ko'rinishi: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n / 2; i++) {
            System.out.println("[ "+i+" ] = "+arr[i]+" ");
            System.out.println("[ "+i+" ] = "+arr[n-1-i]+" ");
        }

        // Agar massiv uzunligi toq bo'lsa, o'rtadagi elementni chiqarish
        if (n % 2 != 0) {
            System.out.println("[ "+n/2+" ] = "+arr[n/2]+" ");
        }
    }
}

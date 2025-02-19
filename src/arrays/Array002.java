package arrays;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.pow(2,i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

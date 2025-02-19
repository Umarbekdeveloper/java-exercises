package arrays;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*i+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

package arrays;

import java.util.Scanner;

public class Array007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}

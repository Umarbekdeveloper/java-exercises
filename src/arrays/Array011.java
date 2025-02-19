package arrays;

import java.util.Scanner;

public class Array011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n :");
        int n = sc.nextInt();
        System.out.print("k 1<=k<n :");
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

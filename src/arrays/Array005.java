package arrays;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Finonachchi hadi n :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int f0=0;
        int f=1;
        int fn;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =i;
            arr[n]=arr[n-1]+arr[n-2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

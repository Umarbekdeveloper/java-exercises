package arrays;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Finonachchi hadi n :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

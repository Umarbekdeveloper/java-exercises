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
            arr[i]=(int)(Math.random()*100);
        }
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i =k; i < arr.length; i+=k) {
            System.out.print(arr[i]+" ");
        }
    }
}

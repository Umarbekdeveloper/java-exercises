package arrays;

import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Progressiya hadi n :");
        int n = sc.nextInt();
        System.out.print("Progressiya 1-hadi :");
        int a1 = sc.nextInt();
        System.out.print("Progressiya ayirmasi :");
        int d = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a1*(int)Math.pow(d,i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

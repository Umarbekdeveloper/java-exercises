package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n n>0:");
        int n = sc.nextInt();
        System.out.print("k 0<k<l<n:");
        int k = sc.nextInt();
        System.out.print("l 0<k<l<n:");
        int l = sc.nextInt();
        Random random = new Random();
        int arr[] = new int[n];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);
        }
        System.out.println("Arrayni umumiy ko'rinishi: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = k; i <= l; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

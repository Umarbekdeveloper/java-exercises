package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n n>0:");
        int n = sc.nextInt();
        Random random = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);
        }
        System.out.println("Arrayni umumiy ko'rinishi: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length-1]>arr[i]){
                System.out.println("[ "+i+" ] = "+arr[i]+" ");
                break;
            }
        }
        System.out.println(0);
    }
}

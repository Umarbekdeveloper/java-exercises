package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n ( natural soni va a,b butun sonlar :");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[n];
        arr[0]=a;
        arr[1]=b;
        arr[2]=a+b;
        for (int i = 3; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

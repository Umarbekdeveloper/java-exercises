package arrays;

import java.util.Scanner;

public class Array015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n n>0:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println("Arrayni umumiy ko'rinishi: ");
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Arrayni toq indekslaridagi: ");
        for (int i = 1; i < arr.length; i+=2) {
            System.out.println("[ "+i+" ] = "+arr[i]+" ");
        }
        System.out.println();
        System.out.println("Arrayni juft indekslaridagi: ");
        for (int i = arr.length-2; i >= 0; i-=2) {
            System.out.println("[ "+i+" ] = "+arr[i]+" ");
        }
    }
}

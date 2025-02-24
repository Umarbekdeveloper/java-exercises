package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n n>0:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arrayni umumiy ko'rinishi: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        int i = 0, j = arr.length-1;
        while (i<j){
            System.out.print("[ "+i+" ] = "+arr[i++]+" ");
            if (i>=j) break;
            System.out.print("[ "+(i)+" ] = "+arr[i++]+" ");
            System.out.print("[ "+(j)+" ] = "+arr[j--]+" ");
            if (i>=j) break;
            System.out.print("[ "+(j)+" ] = "+arr[j--]+" ");
        }

        // Agar massiv uzunligi toq bo'lsa, o'rtadagi elementni chiqarish
        if (i==j) {
            System.out.print("[ "+i+" ] = "+arr[i]+" ");
        }
    }
}

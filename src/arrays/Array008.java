package arrays;

import java.util.Scanner;

public class Array008 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n :");
        int count = 0;
        int arr[] = {4,9,5,6,3,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                System.out.println(arr[i]+" ");
                count++;
            }
        }
        System.out.println("Toqlar soni: "+count);
    }
}

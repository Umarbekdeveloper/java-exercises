package arrays;

public class Array010 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n :");
        int count = 0;
        int arr[] = {4,9,5,2,6,3,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("Juftlar soni: "+count);
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]%2==1){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("Toqlar soni: "+count);
    }
}

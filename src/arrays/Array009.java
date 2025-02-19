package arrays;

public class Array009 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("n :");
        int count = 0;
        int arr[] = {4,9,5,6,3,1};
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]%2==0){
                System.out.println(arr[i]+" ");
                count++;
            }
        }
        System.out.println("Juftlar soni: "+count);
    }
}

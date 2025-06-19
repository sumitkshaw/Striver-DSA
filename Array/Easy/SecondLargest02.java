import java.util.*;

public class SecondLargest02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Length of the array
        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int slargest = Element(arr);

        System.out.println(slargest);
        sc.close();

    }
    public static int Element(int []arr){
        if(arr.length < 2){
            return -1; // Not enough elements for second largest
        }
        int largest = arr[0];
        int secondLargest = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

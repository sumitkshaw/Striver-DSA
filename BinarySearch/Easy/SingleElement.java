import java.util.Scanner;

public class SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = Single(arr);
        System.out.println(result);
        sc.close();
    }
    public static int Single(int []nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){

            int mid = start + (end-start) / 2;
            if (mid % 2 == 1){
                mid--;
            }

            if (nums[mid] != nums[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 2;
            }
        }
        return nums[end];
    }
}

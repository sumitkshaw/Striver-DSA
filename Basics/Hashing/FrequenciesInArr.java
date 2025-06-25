import java.util.*;

public class FrequenciesInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] result = frequencies(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();

    }
    public static int[] frequencies(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i],0)+1);
        }
        int [] result = new int[arr.length];

        for(int i=0; i<result.length; i++){
            result[i] = frequencyMap.getOrDefault(i+1, 0);
        }
        return result;
    }
}

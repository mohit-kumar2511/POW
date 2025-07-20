package optimalApproach;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptimalApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = subarraySum(arr, k);
        System.out.println(result);
        
        sc.close();
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        
        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
        
            currentSum += num;
           
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }
            
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}

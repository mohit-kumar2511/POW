package optimal;
import java.util.*;

public class Min_inSort_rotated_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        int min = findMinInRotatedArray(arr, 0, n - 1);
        System.out.println(min);
    }

    private static int findMinInRotatedArray(int[] arr, int left, int right) {
        int ans = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid]>arr[right]){
                left = mid + 1;
            }else{
                ans = Math.min(ans, arr[mid]);
                right = mid - 1;
            }
        }
        return ans; 
    }
}

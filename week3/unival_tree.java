class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total = total + nums[i];
        }
        if(total%2!=0){
            return false;
        }
        int target = total/2;        // divide the total by 2 to satisfy the target
        boolean dp[][] = new boolean[nums.length+1][target+1];
        for (int i = 0; i <= nums.length; i++) dp[i][0] = true;
        for(int i=1;i<=nums.length;i++){
            for(int sum = 1;sum<=target;sum++){
                if(sum<nums[i-1]){
                    dp[i][sum] = dp[i-1][sum];          //by using dp
                }
                else{
                    dp[i][sum] = dp[i-1][sum] || dp[i-1][sum-nums[i-1]];
                }
            }
        }
        return dp[nums.length][target];
    }
}

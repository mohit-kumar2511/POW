class Solution {
    public int search(int[] nums, int target) {
       int j=nums.length-1;
       int i=0;
       if(nums.length==1&&target==nums[0]){
        return 0;
       }
       while(i<=j){
        int mid=i+(int)(j-i)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            j=mid-1;
        }
        else if(nums[mid]<target){
            i=mid+1;
        }
       } 
       return -1;
    }
}

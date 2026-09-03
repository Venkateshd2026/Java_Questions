class Solution {
    public int minimumSwaps(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<right){
            while(left<nums.length&&nums[left]!=0){
                left++;
            }
            while(right>=0&&nums[right]==0){
                right--;
            }
            if(left<right){
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}
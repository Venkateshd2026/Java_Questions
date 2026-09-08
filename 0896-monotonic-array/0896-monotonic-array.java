class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>=nums[i]){
                count++;
                 if(count==nums.length-1){
                     return true;
                     }
            }
            if(nums[i+1]<=nums[i]){
                count1++;
                if(count1==nums.length-1){
                     return true;
                        }
            }
        }
       
        
        return false;
    }
}
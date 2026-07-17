class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(range(nums,0,n-2),range(nums,1,n-1));
    }
    public static int range(int nums[],int start,int end){
        int i1=0;
        int e=0;
        for(int i=start;i<=end;i++){
            int ni=e+nums[i];
            int ne=Math.max(e,i1);
            i1=ni;
            e=ne;
        }
        return Math.max(e,i1);
    }
}
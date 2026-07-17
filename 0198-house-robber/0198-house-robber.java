class Solution {
    public int rob(int[] nums) {
        int i1=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            int ni=e+nums[i];
            int ne=Math.max(e,i1);
            i1=ni;
            e=ne;
        }
        return Math.max(0,Math.max(e,i1));
    }
}
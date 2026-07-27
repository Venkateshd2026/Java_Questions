class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            int curmax=(nums[i]-1)*(nums[j]-1);
                    max=Math.max(max,curmax);
        }
        }
        return max;
    }
}
// class Solution {
//     public int maxProduct(int[] nums) {
//         int max = 0;

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 int cur = (nums[i] - 1) * (nums[j] - 1);
//                 max = Math.max(max, cur);
//             }
//         }

//         return max;
//     }
// }
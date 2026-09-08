// class Solution {
//     public int getMinDistance(int[] nums, int target, int start) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 return Math.abs(i-start);
//             }
//         }
//         return 0;
        
//     }
// }
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int distance = Math.abs(i - start);

                if (distance < min) {
                    min = distance;
                }
            }
        }

        return min;
    }
}
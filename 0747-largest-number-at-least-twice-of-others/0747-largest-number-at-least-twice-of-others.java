// class Solution {
//     public int dominantIndex(int[] nums) {
//          Arrays.sort(nums);
//         int max=nums[nums.length-1];
//         for(int i=0;i<nums.length;i++){
//             int r=nums[i]*2;
//             if(r>max){
//                 if(r/2==max){
//                     continue;
//                 }
//                 return -1;
//             }
//         }
//         return 1;
//     }
// }
class Solution {
    public int dominantIndex(int[] nums) {
         int index=0;
         for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[index]){
                index=i;
            }
         }
         for(int i=0;i<nums.length;i++){
            if(i!=index&&nums[index]<2*nums[i]){
                return -1;
            }
         }
         return index;
    }
}
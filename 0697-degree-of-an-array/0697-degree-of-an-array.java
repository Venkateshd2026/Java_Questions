class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>first=new HashMap<>();
        HashMap<Integer,Integer>last=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(!first.containsKey(nums[i])){
                first.put(nums[i],i);
            }
            last.put(nums[i],i);

        }
        int degree=0;
        for(int i=0;i<nums.length;i++){
            degree=Math.max(degree,map.get(nums[i]));
        }
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.get(num)==degree){
                int length=last.get(num)-first.get(num)+1;
                ans=Math.min(ans,length);
            }
        }
        return ans;

    }
}
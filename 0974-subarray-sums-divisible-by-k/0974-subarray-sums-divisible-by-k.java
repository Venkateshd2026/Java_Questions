class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            int r=(int)((prefix%k)+k)%k;
            count+=map.getOrDefault(r,0);
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
        
    }
}
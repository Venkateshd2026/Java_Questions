class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int total=0;
        for(int num:nums){
            if(num%2!=0){
                sum++;
            }
            if(map.containsKey(sum-k)){
            total=total+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return total;
        
    }
}
class Solution {
    public static boolean ispossible(int piles[],int h,int mid){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours +=(piles[i]+mid-1)/mid;
            if(hours>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
         for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
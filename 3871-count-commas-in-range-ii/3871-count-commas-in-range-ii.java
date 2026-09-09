class Solution {
    public long countCommas(long n) {
        // long res=0;
        // if(n<1000){
        //     return res;
        // }
        // if(n>1000){
        //     res=n-1000;
        // }
        // return res+1;
        long ans = 0;

        for (long x = 1000; x <= n; x *= 1000) {
            ans += n - x + 1;
        }

        return ans;
        
    }
}
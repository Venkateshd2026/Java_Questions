class Solution {
    public int countCommas(int n) {
        int res=0;
        if(n<1000){
            return res;
        }
        if(n>1000){
            res=n-1000;
        }
        return res+1;
        
    }
}
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int prev=-n;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                prev=i;
            }
                ans[i]=i-prev;
            
        }
        prev=2*n;
        for(int i=n-1;i>=0;i--){
           if(s.charAt(i)==c){
                prev=i;
            }
            ans[i]=Math.min(ans[i],prev-i);
        }        
        return ans;
    }
}
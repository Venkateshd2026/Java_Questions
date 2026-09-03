class Solution {
    public int countBinarySubstrings(String s) {
        int count=0;
        int prev=0;
        int cur=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }else{
                count+=Math.min(prev,cur);
                prev=cur;
                cur=1;

            }
        }
        count+=Math.min(cur,prev);
        return count;
        
    }
}
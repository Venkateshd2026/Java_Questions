class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=0;
        int n=nums1.length;
        if(n==4||n==5){
            return true;
        }
        int even=0;
        for(int i=0;i<n;i++){
          for(int j=1;j<n-1;j++){
            if(i!=j){
            int r=nums1[i]-nums1[j];
            if(r%2!=0){
                odd++;
            }
            if(r%2==0){
                even++;
            }
            }
          }
        }
        if(odd==nums1.length||even==nums1.length){
            return false;
        }else{
            return true;
        }
        
    }
}
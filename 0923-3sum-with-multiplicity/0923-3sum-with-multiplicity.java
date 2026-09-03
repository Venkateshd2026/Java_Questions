// class Solution {
//     public int threeSumMulti(int[] arr, int target) {
//          long count = 0;
//         int mod = 1000000007;
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length-2;i++){
//             int left=i+1;
//             int right=arr.length-1;
//             while(left<right){
//                 int sum=arr[i]+arr[left]+arr[right];
//                 if(sum==target){

//                      if (arr[left] == arr[right]) {

//                         long n = right - left + 1;

//                         count += n * (n - 1) / 2;

//                         break;
//                     }
//                       int leftValue = arr[left];
//                     int rightValue = arr[right];

//                     long leftCount = 0;
//                     long rightCount = 0;
//                     while(left<right&&arr[left]!=leftValue){
//                         leftCount++;
//                     left++;
//                 }
//                 while(left<right&&arr[right]!=rightValue){
//                     rightCount++;
//                     right--;
//                 }
//                     count += leftCount * rightCount;
//                 }else if(sum<target){
//                     left++;
//                 }else{
//                     right--;
//                 }
//                 left++;
//                 right--;
//             }
//         }
//        return (int)(count % mod);
        
//     }
// }
import java.util.Arrays;
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long count=0;
        int mod=1000000007;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    if(arr[left]==arr[right]){
                        long n=right-left+1;
                        count+=n*(n-1)/2;
                        break;
                    }
                    int leftValue=arr[left];
                    int rightValue=arr[right];
                    long leftCount=0;
                    long rightCount=0;
                    while(left<right&&arr[left]==leftValue){
                        leftCount++;
                        left++;
                    }
                    while(left<=right&&arr[right]==rightValue){
                        rightCount++;
                        right--;
                    }
                    count+=leftCount*rightCount;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return (int)(count%mod);
    }
}
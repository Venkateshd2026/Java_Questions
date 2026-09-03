import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int n=people.length;
        Arrays.sort(people);

        int left=0;
        int right=n-1;

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
            }else{
                right--;
            }
            count++;
        }

        return count;
    }
}
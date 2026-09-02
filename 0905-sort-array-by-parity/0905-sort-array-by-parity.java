class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n=arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
        
    }
}
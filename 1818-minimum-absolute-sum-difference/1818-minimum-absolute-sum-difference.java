class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD=1000000007;
        int n=nums1.length;
        int arr[]=nums1.clone();
        long total=0;
        int maxGain=0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int currentDiff = Math.abs(nums1[i] - nums2[i]);
            total += currentDiff;
            int idx = Arrays.binarySearch(arr, nums2[i]);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx < n) {
                maxGain = Math.max(maxGain,currentDiff - Math.abs(arr[idx] - nums2[i]));
            }
            if (idx > 0) {
                maxGain = Math.max(maxGain,currentDiff - Math.abs(arr[idx - 1] - nums2[i]));
            }
        }
        return (int) ((total - maxGain + MOD) % MOD);
    
}
}
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        
        // Check if already sorted
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        
        if (n <= 2) return -1;
        
        // Find min and max characters
        char minChar = arr[0], maxChar = arr[0];
        for (char c : arr) {
            minChar = (char) Math.min(minChar, c);
            maxChar = (char) Math.max(maxChar, c);
        }
        
        // Check condition for 1 operation
        // Min char at start (and not all same/whole string) or max char at end
        if (arr[0] == minChar || arr[n - 1] == maxChar) {
            return 1;
        }
        
        // Check if min char appears anywhere in a proper prefix
        boolean minInProperPrefix = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == minChar) {
                minInProperPrefix = true;
                break;
            }
        }
        
        // Check if max char appears anywhere in a proper suffix
        boolean maxInProperSuffix = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] == maxChar) {
                maxInProperSuffix = true;
                break;
            }
        }
        
        if (!minInProperPrefix && !maxInProperSuffix) {
            return 3;
        }
        
        return 2;
    }
}
class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int reversedAlphabetPos = 'z' - s.charAt(i) + 1;
            int stringPos = i + 1;
            totalSum += reversedAlphabetPos * stringPos;
        }
        
        return totalSum;
    }
}
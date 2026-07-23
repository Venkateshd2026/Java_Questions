class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int count = t.length();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            
            if (freq[rightChar] > 0) {
                count--;
            }
            freq[rightChar]--;

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]++;
                
                if (freq[leftChar] > 0) {
                    count++;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
class Solution {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack(0, s, new ArrayList<>());

        return res;
    }

    public void backtrack(int index, String s, List<String> list) {

        if (index == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (palindrome(s, index, i)) {

                list.add(s.substring(index, i + 1));

                backtrack(i + 1, s, list);

                list.remove(list.size() - 1);
            }
        }
    }

    public boolean palindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
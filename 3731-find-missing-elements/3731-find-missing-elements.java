import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();

        if (nums.length == 0) {
            return list;
        }

        if (nums.length == 1) {
            return list;
        }

        Arrays.sort(nums);

        int start = nums[0];
        int end = nums[nums.length - 1];

        HashSet<Integer> set = new HashSet<>();

        for (int i = start; i <= end; i++) {
            set.add(i);
        }
        for (int num : nums) {
            set.remove(num);
        }

        list.addAll(set);
        Collections.sort(list);

        return list;
    }
}
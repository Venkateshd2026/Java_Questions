import java.util.*;

class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, 0, res);
        return res;
    }

    private void permute(int[] nums, int index, List<List<Integer>> res) {

        // Base Case
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            res.add(list);
            return;
        }

        // Recursive Case
        for (int i = index; i < nums.length; i++) {

            // Swap
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            permute(nums, index + 1, res);

            // Backtrack
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}
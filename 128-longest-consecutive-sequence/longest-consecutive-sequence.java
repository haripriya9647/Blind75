import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int count = 1;
        int longestStreak = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                count++;
            } else if (nums[i + 1] != nums[i]) {
                count = 1;  // Reset count if a new sequence starts
            }

            longestStreak = Math.max(longestStreak, count);
        }

        return longestStreak;
    }
}

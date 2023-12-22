class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int sum = 0;

        while (i < j) {
            int currHeight = Math.min(height[i], height[j]);
            int currWidth = j - i;
            int currArea = currHeight * currWidth;

            // Update the maximum area
            sum = Math.max(sum, currArea);

            // Move the pointers based on the smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return sum;
    }
}

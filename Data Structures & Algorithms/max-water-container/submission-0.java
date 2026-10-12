class Solution {
    public int maxArea(int[] heights) {
        int low = 0, high = heights.length - 1, max = Integer.MIN_VALUE;

        while (low < high) {
            if (heights[low] < heights[high]) {
                max = Math.max(max, heights[low] * (high - low));
                low++;
            } else {
                max = Math.max(max, heights[high] * (high - low));
                high--;
            }
        }

        return max;
    }
}

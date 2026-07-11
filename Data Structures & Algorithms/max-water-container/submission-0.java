class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int mostWater = 0;
        while (i < j) {
            mostWater = Math.max(mostWater, 
                (j-i)*Math.min(heights[i], heights[j]));
            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return mostWater;
    }
}

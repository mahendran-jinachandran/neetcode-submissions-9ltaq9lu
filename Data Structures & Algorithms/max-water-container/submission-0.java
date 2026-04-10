class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;

        int max = 0;
        while(left < right) {
            
            int width = Math.min(heights[left], heights[right]);
            int dist = right - left;
            int area = width * dist;
            if(area > max) {
                max = area;
            }

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}

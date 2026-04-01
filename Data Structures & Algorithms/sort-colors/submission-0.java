class Solution {
    public void sortColors(int[] nums) {
        
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for(int num: nums) {
            if(num == 0) {
                redCount++;
            } else if(num == 1) {
                whiteCount++;
            } else {
                blueCount++;
            }
        }

        int i = 0;
        int k = 0;
        while(i < redCount) {
            nums[k++] = 0; 
            i++;
        }

        i = 0;
        while(i < whiteCount) {
            nums[k++] = 1; 
            i++;
        }

        i = 0;
        while(i < blueCount) {
            nums[k++] = 2; 
            i++;
        }
    }
}
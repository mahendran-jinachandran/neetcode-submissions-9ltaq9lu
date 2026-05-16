class Solution {
    public int findDuplicate(int[] nums) {
        
        boolean[] result = new boolean[nums.length + 1];

        for(int n: nums) {
            if(result[n] == true) {
                return n;
            }

            result[n] = true;
        }

        return -1;
    }
}
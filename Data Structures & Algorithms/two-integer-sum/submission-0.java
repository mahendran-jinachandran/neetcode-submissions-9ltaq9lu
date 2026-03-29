class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i < n; i++) {

            if(map.containsKey(target - nums[i])) {
                int value = map.get(target - nums[i]);
                result[0] = value;
                result[1] = i;
                break;
            } 
            
            map.put(nums[i], i);
        } 

        return result;
    }
}

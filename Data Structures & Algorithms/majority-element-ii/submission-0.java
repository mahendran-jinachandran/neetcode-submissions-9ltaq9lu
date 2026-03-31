class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int count1 = 0;
        int count2 = 0;

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MAX_VALUE;

        for(int num: nums) {
            if(count1 == 0 && element2 != num) {
                element1 = num;
                count1++;
            } else if(count2 == 0 && element1 != num) {
                element2 = num;
                count2++;
            } else if(element1 == num) {
                count1++;
            } else if(element2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num: nums) {
            if(num == element1) {
                count1++;
            } else if(num == element2) {
                count2++;
            }
        }

        int n = nums.length;
        int minim = n / 3 + 1;
        List<Integer> majority = new ArrayList<>();
         if(count1 >= minim) {
            majority.add(element1);
         } 

         if(count2 >= minim) {
            majority.add(element2);
         }

        return majority;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];

        int size = frequency.length;
        for(int i = 0; i < size; i++) {
            frequency[i] = new ArrayList<>();
        }

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequency[entry.getValue()].add(entry.getKey());
        }


        int index = 0;
        int[] kFrequent = new int[k];

        for(int i = frequency.length - 1; i > 0 && index < k; i--) {
            for(int f: frequency[i]) {
                kFrequent[index++] = f;
                if(k == index) {
                    return kFrequent;
                }
            }
        }

        return kFrequent;
    }
}

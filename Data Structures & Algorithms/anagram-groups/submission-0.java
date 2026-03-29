class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> result = new HashMap<>();

        for(String str: strs) {

            int n = str.length();
            int[] arr = new int[26]; 
            for(int i = 0; i < n; i++) {
                arr[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(arr);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }

        return new ArrayList<>(result.values());
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] result = new int[26];
        int m = s.length();
        for(int i = 0; i < m; i++) {
            result[s.charAt(i) - 'a']++;
        }

        int n = t.length();
        for(int i = 0; i < n; i++) {
            result[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(result[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

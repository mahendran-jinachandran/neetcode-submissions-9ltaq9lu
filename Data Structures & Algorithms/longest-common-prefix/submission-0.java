class Solution {

    public int getCommonPrefix(String str1, String str2) {

        int i = 0;
        int m = str1.length();
        int n = str2.length();
        while(i < m && i < n && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }

        return i--;
    }


    public String longestCommonPrefix(String[] strs) {

        String res = strs[0];
        int n = strs.length;

        for(int i = 1; i < n; i++) {
            int index = getCommonPrefix(res, strs[i]);
            res = res.substring(0, index);
        }   

        return res; 
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {

       StringBuilder result = new StringBuilder();

       int i = 0;
       int m = word1.length();
       int n = word2.length();

       while(i < m && i < n) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i++));
       } 

       while(i < m) {
            result.append(word1.charAt(i++));
       } 

       while(i < n) {
            result.append(word2.charAt(i++));
       }

       return result.toString();
    }
}
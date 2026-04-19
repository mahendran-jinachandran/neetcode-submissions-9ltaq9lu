class Solution {

    public boolean isAlphaNumeric(char c) {
        return (c >= 65 && c <= 90) ||
           (c >= 97 && c <= 122) ||
           (c >= 48 && c <= 57);
    }
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while(i <= j) {
            if(!isAlphaNumeric(s.charAt(i))) {
                i++;
                continue;
            }

            if(!isAlphaNumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}

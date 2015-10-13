// O(N^2) solution
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        String longest = s.substring(0,1);
        int maxLength = 1;
        for (int i = 0; i < s.length(); i ++) {
            String expandedString = expandFromCenter(s, i, i);
            if (expandedString.length() > maxLength) {
                longest = expandedString;
                maxLength = expandedString.length();
            }
            
            expandedString = expandFromCenter(s, i, i + 1);
            if (expandedString.length() > maxLength) {
                longest = expandedString;
                maxLength = expandedString.length();
            }
        }
        
        return longest;
    }
    
    private String expandFromCenter(String s, int ind1, int ind2) {
        int l = ind1;
        int r = ind2;
        
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l --;
            r ++;
        }
        return s.substring(l + 1, r);
    }
}

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";   // Or maybe return null?
        }

    for (int prefixLen = 0; prefixLen < strs[0].length(); prefixLen++) {
        char c = strs[0].charAt(prefixLen);
        for (int i = 1; i < strs.length; i++) {
            if ( prefixLen >= strs[i].length() ||
                 strs[i].charAt(prefixLen) != c ) {
                // Mismatch found
                return strs[i].substring(0, prefixLen);
            }
        }
    }
    return strs[0];
    }
}
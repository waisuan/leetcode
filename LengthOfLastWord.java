public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null)
            return 0;
        int len = s.length();
        
        int start = len-1;
        while(start>= 0 && s.charAt(start) == ' '){
            start--;
        }
        
        int count = 0;
        for(int i = start; i >= 0; i--){
            if(s.charAt(i) == ' ')
                break;
            count++;
        }
        
        return count;
    }
}
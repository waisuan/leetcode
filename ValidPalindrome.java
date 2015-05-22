public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+","");
        
        if(s.isEmpty()){
            return true;
        }
        
        s = s.toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left <= right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            
            if(Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right)) && s.charAt(left) != s.charAt(right              )){
               return false; 
            }else{
                left++;
                right--;
            }
        }
        
        return true;
    }
}
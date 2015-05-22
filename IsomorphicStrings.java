public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(null == s || null == t)
            return false;
        
        Map<String, String> map = new HashMap<String, String>();
        Map<String, Boolean> map2 = new HashMap<String, Boolean>();
        
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(null == map.get(String.valueOf(s.charAt(i)))){
                if(null != map2.get(String.valueOf(t.charAt(i)))){
                    return false;
                }
                map.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
                map2.put(String.valueOf(t.charAt(i)), true);
            }else{
                if(!map.get(String.valueOf(s.charAt(i))).equals(String.valueOf(t.charAt(i)))){
                    return false;
                }
            }
        }
        
        return true;
    }
}
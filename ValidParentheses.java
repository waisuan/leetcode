public class Solution {
    public boolean isValid(String s) {
        List<String> st = new ArrayList<String>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || 
                s.charAt(i) == '[' ||
                s.charAt(i) == '{'){
                st.add(String.valueOf(s.charAt(i)));   
            }else{
                if(s.charAt(i) == '}'){
                    if(st.size() == 0)
                        return false;
                    if(!st.get(st.size()-1).equals("{")){
                        return false;
                    }else{
                        st.remove(st.size()-1);
                    }
                }else if(s.charAt(i) == ']'){
                    if(st.size() == 0)
                        return false;
                    if(!st.get(st.size()-1).equals("[")){
                        return false;
                    }else{
                        st.remove(st.size()-1);
                    }
                }else if(s.charAt(i) == ')'){
                    if(st.size() == 0)
                        return false;
                    if(!st.get(st.size()-1).equals("(")){
                        return false;
                    }else{
                        st.remove(st.size()-1);
                    }
                }
            }
        }
        
        if(st.size() != 0)
            return false;
        return true;
    }
}
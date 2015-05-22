public class Solution {
    public String countAndSay(int n) {
        
        if(n == 1)
            return "1";
        
        String seq = "1";
        for(int i = 0; i < n-1; i++){
            String temp = "";
            for(int j = 0; j < seq.length(); j++){
                char a = seq.charAt(j);
                int count = 1;
                if(j+1 < seq.length() && seq.charAt(j+1) == a){
                    int k = j+1;
                    while(k < seq.length() && seq.charAt(k) == a){
                        count++;
                        k++;
                    }
                    j+=count-1;
                    temp += count + String.valueOf(a);
                }else{
                    temp += 1 + String.valueOf(a);
                }
            }
            seq = temp;
        }
        
        return seq;
    }
}
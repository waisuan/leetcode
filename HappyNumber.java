public class Solution {
    public boolean isHappy(int n) {
        if(n<=0)
            return false;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        int sum = 0;
        boolean newDigit = false;
        boolean found=false;
        while(!found){
            int a = n % 10;
            n = n/10;
            
            if(null == map.get(a)){
                map.put(a, a*a);
                newDigit = true;
            }
            
            sum += map.get(a);
            
            if(n == 0){
                if(sum != 1){
                    if(!newDigit){
                        if(null == map.get(sum)){
                            map.put(sum, -1);
                        }else{
                            break;
                        }
                    }
                    n = sum;
                    sum = 0;
                    newDigit = false;
                }else{
                    found = true;
                }
            }
        }
        
        return found;
    }
}
public class Solution {
    public int reverse(int x) {
        
        long res = 0;
        int p = x;
        
        while(p != 0){
            int mod = p % 10;
            p = p / 10;
            res = res * 10 + mod;
            if(res > Integer.MAX_VALUE) return 0;
            if(res < Integer.MIN_VALUE) return 0;
        }
        
        return (int) res;
    }
}
public class Solution {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int s1 = 1;
        int s2 = 2;
        int result = 0;
        for(int i = 2; i < n; i++){
            result = s1 + s2;
            s1 = s2;
            s2 = result;
        }
        return result;
    }
}
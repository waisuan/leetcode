public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //boolean[] bits = new boolean[Integer.SIZE];
        int count = 0;
		for (int i = Integer.SIZE-1; i >= 0; i--) {
			if((n & (1 << i)) != 0){
			    count++;
			}
		}
		
		return count;
    }
}
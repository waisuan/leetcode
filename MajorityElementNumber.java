public class Solution {
    public int majorityElement(int[] num) {
        
        if(num.length == 1)
            return num[0];
        
        int maj = num.length / 2;
        Arrays.sort(num);
        int counter = 1;
		int init = num[0];
		int answer = 0;
		for (int i = 1; i < num.length; i++) {
			if (init != num[i]) {
				init = num[i];
				counter = 1;
			} else {
				counter++;
			}
			if (counter >= maj) {
				maj = counter;
				answer = num[i];
				
			}
		}
		
		return answer;
    }
}
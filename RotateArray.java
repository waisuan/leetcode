public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
 
	    if (nums == null || k < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
	    }
        
        int a = nums.length - k; 
 
        /*
        int[] temp = new int[nums.length];
        
        for(int i = 0; i < k; i++){
            temp[i] = nums[nums.length-k+i];    
        }
        
        for(int i = 0; i < nums.length-k; i++){
            temp[i+k] = nums[i];
        }
        
        System.arraycopy(temp, 0, nums, 0, nums.length);
        */ 
        
        if(k > 0){
            for(int i = 0; i < k; i++){
                int temp = nums[nums.length-k+i];
                //nums[i] = nums[nums.length-k+i];
                //nums[nums.length-k+i] = temp;
                int temp2 = nums[i];
                for(int j = i+1; j <= nums.length-k+i; j++){
                    int temp3 = nums[j];
                    nums[j] = temp2;
                    temp2 = temp3;
                }
                nums[i] = temp;
            }
        }
        
        /*
	    reverse(nums, 0, a-1);
	    reverse(nums, a, nums.length-1);
	    reverse(nums, 0, nums.length-1); 
	    */
    }
    /*
    private void reverse(int[] arr, int left, int right){
        while(left < right){
		    int temp = arr[left];
		    arr[left] = arr[right];
		    arr[right] = temp;
		    left++;
		    right--;
	    }
    }
    */
}
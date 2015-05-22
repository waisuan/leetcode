public class Solution {
    public int countPrimes(int n) {
        if(n <= 2)
            return 0;
        
        //sieve of Eratosthenes
        boolean[] arr = new boolean[n];
        int counter = 2;
        int index = counter;
        while(true){
            if((counter+index) >= n){
                counter = index+1;
                while(counter < n && arr[counter] == true){
                    counter+=1;
                }
                
                if(counter == n){
                    break;
                }
                
                index = counter;
            } else {
                arr[counter+=index] = true;
            }
        }
        
        int count = 0;
        for(int i = 2; i < n; i++){
            if(arr[i] != true)
                count++;
        }
        
        return count;
    }
}
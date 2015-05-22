public class Solution {
    public int removeDuplicates(int[] A) {
        int length = A.length; 
       
        if(0 == length)
            return 0;
        
        int prev = A[0];
        int finalLength = 1;
        int counter = 0;
        for(int i = 1; i < length; i++){
            if(A[i]==prev){
                counter++;
            }else{
               finalLength++;
               prev = A[i];
               if(counter != 0){
                   A[i-counter]=A[i];
               }
            }
        }
        
        return finalLength;
    }
}
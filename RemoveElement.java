public class Solution {
    public int removeElement(int[] A, int elem) {
        int length = A.length;
        
        if(0==length)
            return 0;
        
        int counter = 1;
        int i = 0;
        if(A[i]==elem){
            i = -1;
            counter -= 1;
        }
        for(int j = 1; j < length; j++){
            if(A[j] != elem){
                A[++i] = A[j];
                counter++;
            }
        }
        
        return counter;
    }
}
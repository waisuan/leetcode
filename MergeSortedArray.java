public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int lastA = m - 1;
        int lastB = n - 1;
        int lastMerged = (m+n)-1;
        
        while(lastB >= 0){
            if(lastA>=0 && A[lastA]>B[lastB]){
                A[lastMerged]=A[lastA];
                lastA--;
            }else{
                A[lastMerged]=B[lastB];
                lastB--;
            }
            
            lastMerged--;
        }
    }
}
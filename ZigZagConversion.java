public class Solution {
    public String convert(String s, int nRows) {
        String[][] zigzag = new String[nRows][s.length()];
        
        int wordLength = s.length();
        
        int counter = 0;
        int row = 0;
        int col = 0;
        int prevRow = 0;
        while(counter < wordLength){
            if((col % 2) != 0){
                int mid = prevRow - 1;
                if(mid == 0){
                    row = mid + 1;
                    if(row >= nRows){
                        row = 0;
                    }
                    prevRow = mid;
                    zigzag[mid][col] = String.valueOf(s.charAt(counter++));
                    col++;
                    while(row < nRows && counter < wordLength){
                        prevRow = row;
                        zigzag[row++][col++] = String.valueOf(s.charAt(counter++));
                    }
                    
                    if(row == nRows){
                        row-=2;
                        while(row != 0 && counter < wordLength){
                            prevRow = row;
                            zigzag[row--][col++] = String.valueOf(s.charAt(counter++));
                        }
                    }
                }else{
                    if(mid < 0)
                        mid = 0;
                    row = mid - 1;
                    if(row < 0)
                        row = 0;
                    prevRow = mid;
                    zigzag[mid][col] = String.valueOf(s.charAt(counter++));
                    col++;
                    while(row != 0 && counter < wordLength){
                        prevRow = row;
                        zigzag[row--][col++] = String.valueOf(s.charAt(counter++));
                    }
                }
            }else{
                prevRow = row;
                zigzag[row++][col] = String.valueOf(s.charAt(counter++));
            }
                
            if(row >= nRows){
                row = 0;
                col++;
            }
            //counter++;
        }
        
        String str = "";
        for(int i = 0; i < nRows; i++){
            for(int j = 0; j < wordLength; j++){
                if(null != zigzag[i][j])
                    str+=zigzag[i][j];
            }
        }
        
        return str;
    }
}
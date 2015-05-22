public class Solution {
    public int compareVersion(String version1, String version2) {
        //shorter solution = pad the shorter length version with zeroes!        
        
        if(!version1.contains(".") && !version2.contains(".")){
            if(Long.valueOf(version1) > Long.valueOf(version2)){
                return 1;
            }else if(Long.valueOf(version1) < Long.valueOf(version2)){
                return -1;
            }else{
                return 0;
            }
        }
        
        String[] tokens1 = version1.split("\\.");
        String[] tokens2 = version2.split("\\.");
        
        if(Long.valueOf(tokens1[0]) > Long.valueOf(tokens2[0]))
            return 1;
        else if(Long.valueOf(tokens1[0]) < Long.valueOf(tokens2[0]))
            return -1;
        else {
            int limit = Math.max(tokens1.length, tokens2.length);
            int i = 1;
            while(i < limit){
                if(i != tokens1.length && i != tokens2.length && Long.valueOf(tokens1[i]) > Long.valueOf(tokens2[i]))
                    return 1;
                else if(i != tokens1.length && i != tokens2.length && Long.valueOf(tokens1[i]) < Long.valueOf(tokens2[i]))
                    return -1;
                else {
                    if(i == tokens1.length || i == tokens2.length) {
                        if(tokens1.length > tokens2.length){
                            if(Long.valueOf(tokens1[i]) == 0){
                                boolean allZeros = true;
                                for(int j = i; j < tokens1.length; j++){
                                    if(Long.valueOf(tokens1[j]) != 0){
                                        allZeros = false;
                                        break;
                                        
                                    }
                                }
                                if(allZeros)
                                    return 0;
                                
                            }
                            return 1;
                        }else if(tokens1.length < tokens2.length){
                            if(Long.valueOf(tokens2[i]) == 0){
                                boolean allZeros = true;
                                for(int j = i; j < tokens2.length; j++){
                                    if(Long.valueOf(tokens2[j]) != 0){
                                        allZeros = false;
                                        break;
                                        
                                    }
                                }
                                if(allZeros)
                                    return 0;
                            }
                            return -1;
                        }
                        //break;
                    }
                }
                
                i++;
            }
        }
        
        return 0;
    }
}
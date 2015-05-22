public class Solution {
    public int atoi(String str) {
        String filtered = "";
        boolean minus = false;
        boolean plus = false;
        boolean space = false;
        boolean hasFiltered = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                if(str.charAt(i) == '-'){
                    if(minus)
                        return 0;
                    if(plus)
                        return 0;
                    filtered += "-";
                    minus = true;
                }else if(str.charAt(i) == '+'){
                    if(plus)
                        return 0;
                    if(minus)
                        return 0;
                    filtered += "";
                    plus = true;
                }else {
                    try {
                        int a = Integer.parseInt(String.valueOf(str.charAt(i)));
                        filtered += String.valueOf(str.charAt(i));
                        hasFiltered = true;
                    }catch(NumberFormatException nfe){
                        if(!hasFiltered)
                            return 0;
                        break;
                    }
                }
            }else{
                if(hasFiltered || plus || minus){
                    if(!hasFiltered)
                        return 0;
                    break;
                }
                space = true;
            }
        }
        
        if(filtered.equals(""))
            return 0;
        
        long a = 0;
        try{
            a = Long.parseLong(filtered);
            
            if(a >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(a <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }catch(NumberFormatException nfe){
            if(minus)
                return Integer.MIN_VALUE;
            else if(plus)
                return Integer.MAX_VALUE;
            return Integer.MAX_VALUE;
        }
        
        return (int) a;
    }
}
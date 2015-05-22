public class Solution {
    String[] romanNumerals = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    Map<String, Integer> mapOfRomanNumerals = new HashMap<String, Integer>();
    public int romanToInt(String s) {
        mapOfRomanNumerals.put("I", 1);
        mapOfRomanNumerals.put("IV", 4);
        mapOfRomanNumerals.put("IX", 9);
        mapOfRomanNumerals.put("X", 10);
        mapOfRomanNumerals.put("XL", 40);
        mapOfRomanNumerals.put("L", 50);
        mapOfRomanNumerals.put("XC", 90);
        mapOfRomanNumerals.put("C", 100);
        mapOfRomanNumerals.put("CD", 400);
        mapOfRomanNumerals.put("D", 500);
        mapOfRomanNumerals.put("CM", 900);
        mapOfRomanNumerals.put("M", 1000);
        mapOfRomanNumerals.put("V", 5);
        
        //String[] tokens = s.split("");
        // String[] tokens = s.split("(I | IV | V | IX | X | XL | L | XC | C | D | CD | M | CM)");
        
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            if(i + 1 != s.length()){
                String temp = String.valueOf(s.charAt(i))
						+ String.valueOf(s.charAt(i + 1));
                Integer num = mapOfRomanNumerals.get(temp);
                if(null != num){
                    result += num;
                    i+=1;
                }else{
                    num = mapOfRomanNumerals.get(String.valueOf(s.charAt(i)));
                    result += num;
                }
            }else{
                int num = mapOfRomanNumerals.get(String.valueOf(s.charAt(i)));
                result += num;
            }
            //result += mapOfRomanNumerals.get(tokens[i]);
        }
        
        return result;
    }
}
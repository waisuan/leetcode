public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return null;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++){
            if(i == 0){
                list.add(i+1);
                //finalList.add(list);
                if(i == rowIndex){
                    finalList.add(1);
                    return finalList;
                }
            } else if(i == 1){
                list.add(i);
                list.add(i);
                //finalList.add(list);
                if(i == rowIndex){
                    finalList.add(i);
                    finalList.add(i);
                    return finalList;
                }
            } else{
                if(i == rowIndex){
                    finalList.add(1);
                    list.add(1);
                    for(int j = 1; j < i; j++){
                        finalList.add(list.get(list.size()-i) + list.get(list.size()-i-1));
                        list.add(list.get(list.size()-i) + list.get(list.size()-i-1));
                    }
                    finalList.add(1);
                    list.add(1);
                    
                    return finalList;
                }
                
                list.add(1);
                for(int j = 1; j < i; j++)
                    list.add(list.get(list.size()-i) + list.get(list.size()-i-1));
                list.add(1);
                //finalList.add(list);
            }
        }
        
        return null; 
    }
}
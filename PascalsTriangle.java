public class Solution {
    public List<ArrayList<Integer>> generate(int numRows) {
        List<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(i == 0){
                list.add(i+1);
                finalList.add(list);
            } else if(i == 1){
                list.add(i);
                list.add(i);
                finalList.add(list);
            } else{
                list.add(1);
                for(int j = 1; j < i; j++)
                    list.add(finalList.get(finalList.size()-1).get(j-1)+finalList.get(finalList.size()-1).get(j));
                list.add(1);
                finalList.add(list);
            }
        }
        return finalList;
    }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(null == root)
            return new ArrayList<List<Integer>>();
        
        List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
        List<Integer> list2 = new ArrayList<Integer>();
        listOfList.add(list2);
        listOfList = preOrder(root, listOfList, 0);
        
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        for(int i = listOfList.size()-1; i >= 0 ; i--){
            finalList.add(listOfList.get(i));
        }
        
        return finalList;
    }
    
    public List<List<Integer>> preOrder(TreeNode root, List<List<Integer>> listOfList, int counter){
        if(null == root)
            return null;
    
        int temp = counter;
        if(root.left != null || root.right != null){
        
            counter+=1;
            
            if(counter >= listOfList.size()){
                List<Integer> list2 = new ArrayList<Integer>();
                listOfList.add(list2);
            }
            
            preOrder(root.left, listOfList, counter);
            preOrder(root.right, listOfList, counter);
        }
        
        listOfList.get(temp).add(root.val);
        
        return listOfList;
    }
    
    /*
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    traverse(list, 0 , root);
    return list;
}

private void traverse(List<List<Integer>> list, int level, TreeNode node){
    if(node == null) return;
    if(list.size() - 1 < level) list.add(0, new ArrayList<Integer>());
    list.get(list.size() - level - 1).add(node.val);
    traverse(list, level + 1, node.left);
    traverse(list, level + 1, node.right);
}
*/
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        return preOrder(new ArrayList<List<Integer>>(), 0, root);
    }
    
    public List<List<Integer>> preOrder(List<List<Integer>> list, int counter, TreeNode root){
        if(root == null)
            return null;
        if(counter >= list.size()){
            list.add(new ArrayList<Integer>());
        }
        list.get(counter).add(root.val);
        preOrder(list, counter+1, root.left);
        preOrder(list, counter+1, root.right);
        return list;
    }
}
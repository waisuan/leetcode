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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        
        return traverseSum(root, 0, sum)==1?true:false;   
    }
    
    public int traverseSum(TreeNode root, int currSum, int sum){
        currSum += root.val;
        
        if(root.left == null && root.right == null){
            return currSum==sum?1:0;
        }
        
        if(root.left == null && root.right != null){
            return traverseSum(root.right, currSum, sum);
        }
        
        if(root.left != null && root.right == null){
            return traverseSum(root.left, currSum, sum);
        }
        
        return Math.max(traverseSum(root.left, currSum, sum), traverseSum(root.right, currSum, sum));
    }
}
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
    public boolean isBalanced(TreeNode root) {
        if(null == root)
            return true;
        
        //int left = getHeight(root.left);
        //int right = getHeight(root.right);
        int height = getHeight(root);
        
        if(height == -1)
            return false;
        
        return true;
        //return true?Math.abs(left-right)<=1:false;
    }
    
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        
        //if(root.left == null && root.right != null)
        int right = getHeight(root.right);
        if(right == -1)
            return -1;
        
        //if(root.right == null && root.left != null)
        int left = getHeight(root.left);
        if(left == -1)
            return -1;
            
        if(Math.abs(left-right)>1)
            return -1;
        
        return 1+Math.max(left, right);
    }
}
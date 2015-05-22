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
    public int minDepth(TreeNode root) {
        if(null == root)
            return 0;
        if(null == root.left && null == root.right)
            return 1;
        int rightNode=Integer.MAX_VALUE;
        int leftNode=Integer.MAX_VALUE;
        if(null == root.left)
            rightNode = minDepth(root.right);
        if(null == root.right)
            leftNode = minDepth(root.left);
        if(null != root.left && null != root.right){
            rightNode = minDepth(root.right);
            leftNode = minDepth(root.left);
        }
        return 1+Math.min(leftNode, rightNode);
    }
}
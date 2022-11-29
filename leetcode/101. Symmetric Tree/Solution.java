/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {


    public boolean compareNodes (TreeNode leftRoot, TreeNode rightRoot){
        if ((leftRoot == null && rightRoot != null )  || (rightRoot == null && leftRoot != null))
            return false;
        if (leftRoot == null && rightRoot == null)
            return true;
        if (leftRoot.val != rightRoot.val)
            return false;
        return compareNodes(leftRoot.left, rightRoot.right) && compareNodes(leftRoot.right, rightRoot.left);
    }   

    public boolean isSymmetric(TreeNode root) {
        if  (root == null)
            return true;

        return compareNodes(root.left, root.right);


    }
}

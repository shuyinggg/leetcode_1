/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null && root.right != null){
            //find the depth of two subtrees and return the smaller one.
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        } else {
            //if one of the subtree is null, find the depth of the other subtree. max(depth of the not null subtree,0)
            //Note one subtree is null doesn't mean this node is a leaf. A leaf has two null subtrees. (Base case)
            return Math.max(minDepth(root.left),minDepth(root.right)) + 1;
        }
    }
}

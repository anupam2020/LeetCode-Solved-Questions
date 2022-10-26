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
    public static List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        list.clear();
        if(root==null)
        {
            return list;
        }
        
        inOrder(root);
        return list;
        
    }
    
    public static void inOrder(TreeNode root)
    {
        if(root.left!=null)
        {
            inOrder(root.left);
        }
        list.add(root.val);
        if(root.right!=null)
        {
            inOrder(root.right);
        }
        
    }
    
}
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
            List<Integer> l=new ArrayList<>(); //Globally likhenge to l likhne ki jarurat
                                               // nhi  hai method me

    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> l=new ArrayList<>();
        // inorder(root,l);
        inorder(root);
        return l;
    }
    public void inorder(TreeNode root ){ //List<Integer> l
        if(root==null)
        return;
        


        // inorder(root.left,l);
        // l.add(root.val);
        // inorder(root.right,l);


        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
        
    }
}
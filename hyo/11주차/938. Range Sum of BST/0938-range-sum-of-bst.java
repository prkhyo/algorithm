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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int answer = 0;
        if(root == null){
            return answer;
        }
        if(root.val >= low && root.val <= high) {
            answer += root.val; 
        } 
        if(root.val > low) {
            answer = answer + rangeSumBST(root.left, low, high);
        } 
        if(root.val < high) {
            answer = answer + rangeSumBST(root.right, low, high);
        } 
        return answer;
    }
}
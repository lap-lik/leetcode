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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        Queue<TreeNode> queueP = new LinkedList<>();
        queueP.add(p);
        Queue<TreeNode> queueQ = new LinkedList<>();
        queueQ.add(q);
        while(!queueP.isEmpty()){
            TreeNode nodeP = queueP.poll();
            TreeNode nodeQ = queueQ.poll();

            TreeNode nodePLeft = nodeP.left;
            TreeNode nodeQLeft = nodeQ.left;
            if ((nodePLeft == null && nodeQLeft != null) || (nodePLeft != null && nodeQLeft == null)){
                return false;
            } else if(nodePLeft != null && nodeQLeft != null && nodePLeft.val != nodeQLeft.val) {
                return false;
            } else if(nodePLeft != null && nodeQLeft != null && nodePLeft.val == nodeQLeft.val) {
                queueP.add(nodePLeft);
                queueQ.add(nodeQLeft);         
            }

            TreeNode nodePRight = nodeP.right;
            TreeNode nodeQRight = nodeQ.right;
            if ((nodePRight == null && nodeQRight != null) || (nodePRight != null && nodeQRight == null)){
                return false;
            } else if(nodePRight != null && nodeQRight != null && nodePRight.val != nodeQRight.val) {
                return false;
            } else if(nodePRight != null && nodeQRight != null && nodePRight.val == nodeQRight.val) {
                queueP.add(nodePRight);
                queueQ.add(nodeQRight);         
            }
        }
        return true;
    }
}
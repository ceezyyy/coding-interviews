/**
 * <p>
 * 剑指 Offer 27. 二叉树的镜像
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/18
 */
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {

            // Swap root's children
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            mirrorTree(root.left);
            mirrorTree(root.right);

        }
        return root;
    }
}


/**
 * Need more practice
 */

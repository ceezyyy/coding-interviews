import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/21
 */
class Solution {

    private List<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        inorder(root);
        return list.get(list.size() - k);
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

}

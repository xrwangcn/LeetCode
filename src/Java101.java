import general.TreeNode;
import utils.InputUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Java101 {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = InputUtil.genTreeNode(Arrays.asList(1,2,2,null,3,null,3));
        System.out.println(isSymmetric(treeNode));
    }
}

import general.TreeNode;
import utils.InputUtil;

import java.util.Arrays;

public class Java104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = InputUtil.genTreeNode(Arrays.asList(3, 9, 20, null, null, 15, 7));
        System.out.println(maxDepth(treeNode));
    }
}

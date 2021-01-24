package utils;

import general.ListNode;
import general.TreeNode;

import java.util.List;

public class InputUtil {
    public static ListNode genListNode(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        ListNode listNode = new ListNode(list.get(0), null);
        ListNode temp = listNode;
        for (int i = 1; i < list.size(); i++) {
            ListNode nextListNode = new ListNode(list.get(i), null);
            temp.next = nextListNode;
            temp = nextListNode;
        }
        return listNode;
    }

    /**
     * 根据数组生成二叉树
     *
     * @param list
     * @return
     */
    public static TreeNode genTreeNode(List<Integer> list) {
        return genTreeNode(list, 0);
    }

    private static TreeNode genTreeNode(List<Integer> list, int index) {
        TreeNode node = null;
        if (index < list.size()) {
            if (list.get(index) == null) {
                return null;
            }
            node = new TreeNode(list.get(index));
            node.left = genTreeNode(list, 2 * index + 1);
            node.right = genTreeNode(list, 2 * index + 2);
        }
        return node;
    }
}

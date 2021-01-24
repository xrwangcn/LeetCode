import general.ListNode;
import utils.InputUtil;
import utils.PrintUtil;

import java.util.Arrays;

public class Java021 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode pre = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode result = mergeTwoLists2(InputUtil.genListNode(Arrays.asList(1, 3, 4)), InputUtil.genListNode(Arrays.asList(1, 2, 4)));
        PrintUtil.printListNode(result);
    }
}

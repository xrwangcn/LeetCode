package utils;

import general.ListNode;

public class PrintUtil {
    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void printArr(int[] arr) {
        for (int n : arr) {
            System.out.println(n);
        }
    }
}

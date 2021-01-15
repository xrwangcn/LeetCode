import general.ListNode;

public class Java002 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calListNode(l1, l2, 0);
    }

    public static ListNode calListNode(ListNode l1, ListNode l2, int extraNum) {
        if (l1 == null && l2 == null) {
            if (extraNum == 1) {
                return new ListNode(1, null);
            }
            return null;
        }
        int actNum = 0;
        int l1Temp = 0;
        int l2Temp = 0;
        if (l1 != null) {
            l1Temp = l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            l2Temp = l2.val;
            l2 = l2.next;
        }
        int sumTemp = l1Temp + l2Temp + extraNum;
        if (sumTemp >= 10) {
            actNum = sumTemp % 10;
            extraNum = 1;
        } else {
            actNum = sumTemp;
            extraNum = 0;
        }
        return new ListNode(actNum, calListNode(l1, l2, extraNum));
    }

    public static void main(String[] args) {
        ListNode la10 = new ListNode(9, null);
        ListNode la9 = new ListNode(9, la10);
        ListNode la8 = new ListNode(9, la9);
        ListNode la7 = new ListNode(9, la8);
        ListNode la6 = new ListNode(9, la7);
        ListNode la5 = new ListNode(9, la6);
        ListNode la4 = new ListNode(9, la5);
        ListNode la3 = new ListNode(9, null);
        ListNode la2 = new ListNode(4, la3);
        ListNode la1 = new ListNode(2, la2);

        ListNode lb4 = new ListNode(9, null);
        ListNode lb3 = new ListNode(4, lb4);
        ListNode lb2 = new ListNode(6, lb3);
        ListNode lb1 = new ListNode(5, lb2);
        ListNode result = addTwoNumbers(la1, lb1);
        System.out.println("result");
    }
}

package Company.Huawei.DivideAndRule.LeetCode23;

import java.util.List;

/**
 * 分治
 */

public class Main {

    public static ListNode mergeKLists(ListNode[] lists) {

        return merge(lists, 0, lists.length - 1);
    }

    public static ListNode merge(ListNode[] lists, int l, int r) {

        if (l == r) return lists[l]; // 已经合并完了
        if (l > r) return null;

        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));

    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) { // 合并两个链表

        if (a == null || b == null) return a != null ? a : b;

        // 两个都不为空继续
        ListNode head = new ListNode(0);
        ListNode tail = head; // 尾结点也指着第一个
        ListNode aPtr = a, bPtr = b;  // 分别指向a 、b链表

        while (aPtr != null && bPtr != null) {  // 两个都不为空了说明遍历完了

            if (aPtr.val < bPtr.val) {

                tail.next = aPtr;
                aPtr = aPtr.next;  // 继续读
            } else {

                tail.next = bPtr;
                bPtr = bPtr.next;
            }

            tail = tail.next; // tail 也往后走一步
        }

        // 剩下的
        tail.next = aPtr != null ? aPtr : bPtr;
        return head.next;   // head没用
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    private static ListNode buildLinkedList(int[] values) {  // 根据数组构建链表
        ListNode dummy = new ListNode(); // 这个节点最后不会要的
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        int[][] linkedlistarray = new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}};

        ListNode[] lists = new ListNode[linkedlistarray.length];

        for (int i = 0; i < linkedlistarray.length; i++) {

            ListNode node = buildLinkedList(linkedlistarray[i]);
            lists[i] = node;
        }

        ListNode node = mergeKLists(lists);
        printLinkedList(node);

    }

}

/**
 * 链表节点
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

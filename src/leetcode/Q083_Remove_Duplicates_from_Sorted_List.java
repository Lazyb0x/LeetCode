package leetcode;

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (null==head) return null;
        ListNode tmp = head;
        while (tmp.next!=null) {
            if (tmp.next.val==tmp.val) {
                tmp.next = tmp.next.next;
            }
            else {
                tmp = tmp.next;
            }
        }
        return head;
    }
}

public class Q083_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {
        Solution83 s = new Solution83();
        int[] a = {1,1,2,3,3};
        int[] a2 = {1,1,2};
        int[] a3 = {1};
        ListNode node = ListNode.fromArray(a3);
        node = s.deleteDuplicates(node);
        System.out.println(ListNode.toString(node));
    }
}

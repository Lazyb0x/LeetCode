package leetcode;

class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fhead = new ListNode(0);
        fhead.next = head;
        ListNode p = fhead;
        while (p!=null && p.next!=null && p.next.next!=null) {
            if (p.next.val==p.next.next.val) {
                ListNode t = p.next.next;
                while (t!=null && t.val==p.next.val) {
                    t = t.next;
                }
                p.next = t;
            }
            else {
                p = p.next;
            }
        }
        return fhead.next;
    }
}

public class Q082_Remove_Duplicates_from_Sorted_List_II {
    public static void main(String[] args) {
        Solution82 s = new Solution82();
        int[] n = {1,2,3,3,4,4,5};
        int[] n2 = {1,1,1,2,3};
        ListNode node = ListNode.fromArray(n2);
        node = s.deleteDuplicates(node);
        System.out.println(ListNode.toString(node));
    }
}

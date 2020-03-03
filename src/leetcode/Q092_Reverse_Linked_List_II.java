package leetcode;

class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fhead = new ListNode(0);
        fhead.next = head;
        
        ListNode pm = fhead;        // m 位置的前一个节点
        for (int i=1; i<m; i++) {
            pm = pm.next;
        }
        
        ListNode nm = pm.next;      // m 位置节点
        
        // 反转部分
        ListNode l = nm;
        ListNode r = nm.next;
        for (int i=1; i<=n-m; i++) {
            ListNode tmp = r.next;
            r.next = l;
            l = r;
            r = tmp;
        }
        
        pm.next = l;
        nm.next = r;
        
        return fhead.next;
    }
}

public class Q092_Reverse_Linked_List_II {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = ListNode.fromArray(nums);
        Solution92 s = new Solution92();
        
        head = s.reverseBetween(head, 4, 5);
        System.out.println(ListNode.toString(head));
    }
}

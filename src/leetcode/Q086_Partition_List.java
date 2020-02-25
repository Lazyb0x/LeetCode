package leetcode;

class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode fhead = new ListNode(0);
        fhead.next = head;
        ListNode l = fhead;
        ListNode r = fhead;
        while (r.next!=null) {
            if (r.next.val<x) {
                if (l!=r) {
                    ListNode a = r;
                    ListNode b = r.next;
                    ListNode c = r.next.next;
                    a.next = c;
                    b.next = l.next;
                    l.next = b;
                    r = b;      //交换节点后重新定位指针
                }
                l = l.next;
            }
            r = r.next;
        }
        return fhead.next;
    }
}

public class Q086_Partition_List {
    public static void main(String[] args) {
        Solution86 s = new Solution86();
        int[] nums = {6,5,4,3,2,1};
        
        ListNode n = ListNode.fromArray(nums);
        ListNode x = s.partition(n, 3);
        System.out.println(x.toString());
    }
}

package leetcode;

class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode l = null;
        ListNode curr = head;
        ListNode tmp;
        while(curr!=null) {
            tmp = curr.next;
            curr.next = l;
            l = curr;
            curr = tmp;
        }
        return l;
    }
}

public class Q206_Reverse_Linked_List {
    public static void main(String[] args) {
        Solution206 s = new Solution206();
        
        int[] nums = {1,23,3};
        ListNode node = ListNode.fromArray(nums);
        node = s.reverseList(node);
        System.out.println(ListNode.toString(node));
    }
}

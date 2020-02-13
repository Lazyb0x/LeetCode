package leetcode;

class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode last = new ListNode(0);
        ListNode head = last;
        while (t1!=null||t2!=null) {
        	int n1 = t1!=null?t1.val:Integer.MAX_VALUE;
        	int n2 = t2!=null?t2.val:Integer.MAX_VALUE;
        	if (n1<=n2) {
        		last.next = t1;
        		last = t1;
        		t1 = t1.next;
        	}
        	else {
        		last.next = t2;
        		last = t2;
        		t2 = t2.next;
        	}
        }
    	return head.next;
    }
}

public class Q021 {
	public static void main(String[] args) {
//		ListNode l1 = null;
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		
//		ListNode l2 = null;
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(6);
		
		ListNode listNode = new Solution21().mergeTwoLists(l1, l2);
		System.out.println(ListNode.toString(listNode));
	}
}

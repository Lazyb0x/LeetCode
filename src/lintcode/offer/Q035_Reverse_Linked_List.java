package lintcode.offer;


import lintcode.ListNode;

class Solution35 {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
    	if (head==null) return null;
        ListNode tmp = head;
        ListNode preNode = null;
        ListNode nextNode = tmp.next;
    	while(tmp!=null) {
    		nextNode = tmp.next;
    		tmp.next = preNode;
    		preNode = tmp;
    		tmp = nextNode;
        }
    	return preNode;
    }
}

public class Q035_Reverse_Linked_List {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		Solution35 s = new Solution35();
		s.reverse(l1).printChild();
	}
}

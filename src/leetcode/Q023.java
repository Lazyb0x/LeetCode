package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> tq = new PriorityQueue<ListNode>(ListComparator);
        
        for (int i=0;i<lists.length;i++) {
        	if (lists[i]!=null) tq.offer(lists[i]);
        }
        
        ListNode head = new ListNode(0);	//真正的链表从 head.next 开始
        ListNode last = head;
        
        while (!tq.isEmpty()) {
        	ListNode node = tq.poll();
        	last.next = node;
        	last = node;
        	node = node.next;
        	if (node!=null) tq.offer(node);
        }
        
        return head.next;
    }
    
    public static Comparator<ListNode> ListComparator = new Comparator<ListNode>() {
		@Override
		public int compare(ListNode a, ListNode b) {
			return a.val-b.val;
		}
	};
}

public class Q023 {
	public static void main(String[] args) {
		int[] a1 = {1,4,5};
		int[] a2 = {1,3,4};
		int[] a3 = {2,6};
		ListNode l1 = ListNodeManage.toListNode(a1);
		ListNode l2 = ListNodeManage.toListNode(a2);
		ListNode l3 = ListNodeManage.toListNode(a3);
		ListNode[] lists = {l1,l2,l3};
		Solution23 s = new Solution23();
		
		ListNode l4 = null;
		ListNode[] lists2 = {l4};
		
		ListNode l = s.mergeKLists(lists2);
		if(l!=null) l.printChild();
	}
}

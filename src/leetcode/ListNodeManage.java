package leetcode;

public class ListNodeManage {
	public static ListNode toListNode(int[] array) {
		ListNode head = null;
		for(int i=0;i<array.length;i++) {
			ListNode node = new ListNode(array[i]);
			head = add(head, node);
		}
		return head;
	}
	
	public static ListNode add(ListNode head, ListNode node) {
		ListNode last = head;
		if (head==null) {
			head = node;
		}
		else {
			while (last.next!=null) {
				last = last.next;
			}
			last.next = node;
		}		
		return head;
	}
	
	public static String toString(ListNode n) {
		String s = "[";
		while (n!=null) {
			s += n.val;
			if (n.next!=null) s += ", ";
			n = n.next;
		}
		s += "]";
		return s;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		ListNode l1 = ListNodeManage.toListNode(a);
//		l1.printChild();
	}
}

package leetcode;

public class ListNode {
	int val;
	ListNode next;
	
	public ListNode(int x) {
		val = x;
	}
	
	/**
	 * 把数组转换成链表
	 * @param nums int数组
	 * @return 链表的头节点
	 */
	public static ListNode fromArray(int[] nums) {
	    ListNode head = new ListNode(0);
	    ListNode t = head;
	    for (int i : nums) {
	        t.next = new ListNode(i);
	        t = t.next;
	    }
	    return head.next;
	}
	
	public static String toString(ListNode n) {
	    String s = "[";
	    while (n!=null) {
	        s += n.val;
	        if (n.next!=null) s += ", ";
	        n = n.next;
	    }
	    return s + "]";
	}
	
	/**
	 * 在链表的结尾添加元素
	 * @param head 链表的头节点
	 * @param node 待添加的元素
	 * @return 添加完成的链表头节点
	 */
	public static ListNode add(ListNode head, ListNode node) {
	    ListNode fhead = new ListNode(0);
	    fhead.next = head;
	    ListNode t = fhead;
	    while (t.next!=null)
	        t = t.next;
	    t.next = node;
	    return fhead.next;
	}
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
}

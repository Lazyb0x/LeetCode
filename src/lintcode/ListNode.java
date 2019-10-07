package lintcode;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) {
	    val = x;
	    next = null;
	}
	
	public void printChild() {
		System.out.println(this.val);
		if (next!=null) this.next.printChild();
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
}


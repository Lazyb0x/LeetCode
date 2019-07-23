package leetcode;

public class ListNode {
	int val;
	ListNode next;
	
	public ListNode(int x) {
		val = x;
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

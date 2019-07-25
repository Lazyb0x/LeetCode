package leetcode;

class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode curr = new ListNode(0);
        curr.next = head;
        head = curr;
        
        while (curr!=null && curr.next!=null && curr.next.next!=null) {
    		ListNode left = curr.next;
    		ListNode right = left.next;
    		ListNode next = right.next;
    		
    		curr.next = right;
    		right.next = left;
    		left.next = next;
    		
    		curr = left;
        }
        return head.next;
    }
}

public class Q024 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		ListNode l = ListNodeManage.toListNode(a);
		System.out.println(ListNodeManage.toString(l));
		Solution24 s = new Solution24();
		ListNode l2 = s.swapPairs(l);
		System.out.println(ListNodeManage.toString(l2));
	}
}

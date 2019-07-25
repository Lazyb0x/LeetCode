package leetcode;

class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = new ListNode(0);
        curr.next = head;
        head = curr;
        
        jump:
        while (curr!=null) {
        	int c = k;
        	ListNode tmp = curr.next;
        	while (c>0) {
        		if (tmp!=null) {
        			tmp = tmp.next;
        			c--;
        		}
        		else {
        			break jump;
        		}
        	}
        	
        	c=k;
        	ListNode left = curr.next;
        	ListNode right;
        	while (c>0) {
        		right = left.next;
        		left.next = tmp;
        		tmp = left;
        		left = right;
        		c--;
        	}
        	
        	ListNode begin = curr.next;
        	curr.next = tmp;
        	curr = begin;
        }
        return head.next;
    }
}

public class Q025 {
	public static void main(String[] args) {
		Solution25 s = new Solution25();
		int[] a = {1,2,3,4,5};
		ListNode l = ListNodeManage.toListNode(a);
		ListNode l2 = s.reverseKGroup(l, 2);
		System.out.println(ListNodeManage.toString(l2));
	}
}

package leetcode;

//import java.util.LinkedList;

class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = new ListNode(0);
        curr.next = head;
        head = curr;
        
//        LinkedList<ListNode> stack = new LinkedList<ListNode>();
        
        jump:
        while (curr!=null) {
        	int c = k;
        	ListNode tmp = curr.next;
        	while (c>0) {
        		if (tmp!=null) {
//        			stack.push(tmp);
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
        	
//        	while (!stack.isEmpty()) {
//        		ListNode node = stack.pop();
//        		curr.next = node;
//        		curr = node;
//        	}
//        	curr.next = tmp;
        }
        return head.next;
    }
    
    public boolean isReverse(ListNode node, int k) {
    	int c = k;
    	while (c>0) {
    		if (node!=null) {
    			node = node.next;
    			c--;
    		}
    		else {
    			return false;
    		}
    	}
    	return true;
    }
}

public class Q025 {
	public static void main(String[] args) {
		Solution25 s = new Solution25();
		int[] a = {1,2,3,4,5};
		ListNode l = ListNodeManage.toListNode(a);
		ListNode l2 = s.reverseKGroup(l, 4);
		System.out.println(ListNodeManage.toString(l2));
	}
}

package leetcode;

class Solution23f {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode[] t = new ListNode[lists.length];
        for (int i=0;i<lists.length;i++) {
        	t[i] = lists[i];
        }
        
        ListNode head = new ListNode(0);	//真正的链表从 head.next 开始
        ListNode last = head;
        
        while (true) {
        	boolean isEnd = true;
        	for (ListNode node : t) {
        		if (node != null) isEnd = false;
        	}
        	if (isEnd) break;
        	
        	int pos = getMinNode(t);
        	last.next = t[pos];
        	last = t[pos];
        	t[pos] = t[pos].next;
        }
        
        return head.next;
    }
    
    public int getMinNode(ListNode[] nodes) {
    	int minVal = Integer.MAX_VALUE;
    	int pos = 0;
    	for (int i=0;i<nodes.length;i++) {
    		int tmpVal = nodes[i]!=null ? nodes[i].val : Integer.MAX_VALUE;
    		if (tmpVal<minVal) {
    			minVal = nodes[i].val;
    			pos = i;
    		}
    	}
    	return pos;
    }
}

public class Q023_failed {
	public static void main(String[] args) {
		int[] a1 = {1,4,5};
		int[] a2 = {1,3,4};
		int[] a3 = {2,6};
		ListNode l1 = ListNodeManage.toListNode(a1);
		ListNode l2 = ListNodeManage.toListNode(a2);
		ListNode l3 = ListNodeManage.toListNode(a3);
		ListNode[] lists = {l1,l2,l3};
		Solution23f s = new Solution23f();

		ListNode l = s.mergeKLists(lists);
		System.out.println(ListNode.toString(l));
	}
}

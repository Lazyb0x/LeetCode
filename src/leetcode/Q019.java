package leetcode;

class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t = head;
        ListNode predel=head;
        int i=0;
        while(t!=null) {
        	if (i>n) {
        		predel = predel.next;  //指向被删除节点的前一个结点
        	}
        	t = t.next;
        	i++;
        }
//        ListNode del = predel.next;
//        System.out.println(predel.next.val);
        if (n==i) head = head.next;
        else predel.next = predel.next.next;
        return head;
    }
}

//class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
//}

public class Q019 {
	public static void main(String[] args) {
		ListNode a = new ListNode(0);
		a.next = null;
		ListNode tmp = a;
		for (int i=1;i<11;i++) {
			tmp.next = new ListNode(i);
			tmp = tmp.next;
			tmp.next = null;
		}
		
//		for(ListNode n=a;n!=null;n=n.next) {
//			System.out.println(n.val);
//		}
		
		ListNode b = new ListNode(1);
		b.next = new ListNode(2);
		
		ListNode l = new Solution19().removeNthFromEnd(b, 2);
		
		for(ListNode n=l;n!=null;n=n.next) {
			System.out.println(n.val);
		}
	}
}

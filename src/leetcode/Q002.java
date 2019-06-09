package leetcode;

//class ListNode{
//	int val;
//	ListNode next;
//	public ListNode(int x) {
//		val = x;
//	}
//}

public class Q002 {
	
	public static void main(String[] args) {
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(4);
		ListNode a3 = new ListNode(3);
		a1.next = a2;
		a2.next = a3;
		a3.next = null;
		
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(6);
		ListNode b3 = new ListNode(7);
		b1.next = b2;
		b2.next = b3;
		b3.next = null;
		
		printNode(a1);
		printNode(b1);
		
		ListNode c = addTwoNumbers(a1, b1);
		printNode(c);
	}
	
	public static void printNode(ListNode n) {
		for(ListNode t1=n; t1!=null; t1=t1.next) {
			System.out.print(t1.val + " ");
		}
		System.out.println();
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode tmp1 = l1,tmp2 = l2;
		ListNode l3 = new ListNode(0);
		l3.next = null;
		ListNode tmp3 = l3;
		int carry = 0;
		while(tmp1!=null||tmp2!=null) {
			int v1,v2,v3=0;
			v1 = tmp1!=null?tmp1.val:0;
			v2 = tmp2!=null?tmp2.val:0;
			
			v3 = (v1+v2+carry)%10;
			tmp3.val = v3;
			carry = (v1+v2+carry)/10;
			
			boolean a = tmp1==null;
			boolean b = tmp1==null?false:tmp1.next==null;
			boolean c = tmp2==null;
			boolean d = tmp2==null?false:tmp2.next==null;
			
			if ((b&d|b&c|a&d)&&carry==0) {				//排除最高位是0的情况
				tmp3.next = null;
			}
			else {
				tmp3.next = new ListNode(carry);
				tmp3 = tmp3.next;
				tmp3.next = null;
			}
			
			if(tmp1!=null) tmp1 = tmp1.next!=null?tmp1.next:null;
			if(tmp2!=null) tmp2 = tmp2.next!=null?tmp2.next:null;
			
		}
		
		return l3;
	}
}

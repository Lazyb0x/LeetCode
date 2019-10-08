package lintcode.offer;

import java.util.LinkedList;

class MyQueue {
	LinkedList<Integer> l1;
	LinkedList<Integer> l2;
    public MyQueue() {
        // do intialization if necessary
    	l1 = new LinkedList<Integer>();
    	l2 = new LinkedList<Integer>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
    	l1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
    	top();
    	return l2.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
    	if (l2.isEmpty()) {
    		while (!l1.isEmpty()) {
    			l2.push(l1.pop());
    		}
    	}
    	return l2.isEmpty() ? 0 : l2.peek();
    }
}

public class Q040_Implement_Queue_by_Two_Stacks {
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		System.out.println(q.pop());
		q.push(3);
		System.out.println(q.top());
		System.out.println(q.pop());

	}
}

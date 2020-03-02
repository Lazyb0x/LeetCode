package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1,q2;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
        while (q1.size()!=1) {
            q2.offer(q1.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int val = q1.poll();
        while(q2.size()>1) {
            q1.offer(q2.poll());
        }
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
        return val;
    }
    
    /** Get the top element. */
    public int top() {
        return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

public class Q225_Implement_Stack_using_Queues {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        System.out.println(s.top());
        s.push(2);
        s.push(3);

        while(!s.empty()) {
            int n = s.pop();
            System.out.println(n);
        }
        System.out.println("fsdafas");
    }
}

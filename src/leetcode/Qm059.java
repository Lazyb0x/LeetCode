package leetcode;

import java.util.Deque;
import java.util.LinkedList;

// 单调队列，保存的是单调递减的序列

class MaxQueue {
    Deque<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<Integer>();
        deque = new LinkedList<Integer>();
    }
    
    public int max_value() {
        return queue.isEmpty() ? -1 : deque.peekFirst();
    }
    
    public void push_back(int value) {
        queue.offerLast(value);
        while(!deque.isEmpty() && deque.peek()<value) {
            deque.pollLast();
        }
        deque.offerLast(value);
    }
    
    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int val = queue.pollFirst();
        if (val==deque.peek()) {
            deque.pollFirst();
        }
        return val;
    }
}

public class Qm059 {
    public static void main(String[] args) {
        MaxQueue q = new MaxQueue() {
            {
                push_back(3);
                push_back(2);
                push_back(1);
            }
        };
        System.out.println(q.max_value());
        System.out.println(q.pop_front());
        System.out.println(q.max_value());
        System.out.println(q.pop_front());
        System.out.println(q.max_value());
        System.out.println(q.pop_front());
        System.out.println(q.max_value());
    }
}

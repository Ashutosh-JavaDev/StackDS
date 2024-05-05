package StackDS;

import java.util.Stack;

public class PeekPopPush {
    static class nodeing {
        int data;
        nodeing next;

        nodeing(int data) {
            this.data = data;
            next = null;
        }
    }

    static class stack {
        public static nodeing head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            nodeing newHead = new nodeing(data);
            if (isEmpty()) {
                head = newHead;
                return;
            }
            newHead.next = head;
            head = newHead;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[]args){
        stack s=new stack();
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

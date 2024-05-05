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
    }
}

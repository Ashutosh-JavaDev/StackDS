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
    }
}

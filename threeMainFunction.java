package StackDS;

import java.util.Stack;

public class threeMainFunction {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

            next = null;
        }
    }

    static class Stacking {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }
        public static void peek(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
              if(isEmpty()){
               return -1;
            }
            int top=head.data;
            head.next=head;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(

                    s.peek()

            );
            s.pop();
        }

    }
}
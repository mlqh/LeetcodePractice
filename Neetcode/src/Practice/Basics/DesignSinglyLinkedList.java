package Practice.Basics;

import java.util.ArrayList;

public class DesignSinglyLinkedList {
    class Node {
        int value;
        Node next;

        public Node(int val) {
            this(val, null);
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }

        public void SetNext(Node next) {
            this.next = next;
        }
    }

    class LinkedList {
        private Node head;
        private Node tail;
        int size = 0;

        public LinkedList() {
            this.head = new Node(-1);
            this.tail = this.head;
        }

        public int get(int index) {
            if(index > size - 1) return -1;

            Node curr = head.next;
            int i = 0;
            while(curr != null && i < index) {
                curr = curr.next;
                i++;
            }
            return curr.value;
        }

        public void insertHead(int val) {
            Node newHead = new Node(val);
            newHead.SetNext(head.next);
            head.SetNext(newHead);
            if(newHead.next == null) {
                tail = newHead;
            }
            size++;
        }

        public void insertTail(int val) {
            this.tail.next = new Node(val);
            this.tail = this.tail.next;
            size++;
        }

        public boolean remove(int index) {
            if(index > size - 1) return false;
            Node curr = this.head;
            int i = 0;
            while(curr != null && i < index) {
                curr = curr.next;
                i++;
            }
            if(curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            size--;
            return true;     
        }

        public ArrayList<Integer> getValues() {
            ArrayList<Integer> values = new ArrayList<>();
            if(this.size == 0) return values;

            Node curr = this.head.next;
            while(curr != null) {
                values.add(curr.value);
                curr = curr.next;
            }
            return values;
        }

    }
}

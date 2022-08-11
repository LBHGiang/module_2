package ss10_dsa_list.practice.linkedList;

public class MyLinkedList {
    private Node head = null;
    private static int numNodes = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        this.head.next = new Node();
        this.head.next.setData(data);
    }

    public void add(int index, Object data) {


    }


    private class Node {
        private Node next;
        private Object data;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
}

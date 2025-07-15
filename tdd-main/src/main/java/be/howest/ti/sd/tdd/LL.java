package be.howest.ti.sd.tdd;

public class LL {

    private int size = 0;
    private Node head = null;

    private class Node {
        final int element;
        Node next;

        private Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, int value) {
        if(index < 0 || index > size){
            throw new OutOfBoundsException();
        }
        if (index == 0) {
            head = new Node(value, head);
        } else {
            Node prev = getNode(index-1);
            prev.next = new Node(value, prev.next);
        }
        size++;
    }

    public void remove(int index) {
        if (isOutOfBounds(index)) {
            throw new OutOfBoundsException();
        }
        Node prev = getNode(index-1);
        Node nodeToRemove = prev.next;
        prev.next = nodeToRemove.next;
        size --;
    }

    public int get(int index) {
        if(isOutOfBounds(index)){
            throw new OutOfBoundsException();
        }
        final Node current = getNode(index);
        return current.element;
    }

    private Node getNode(int index) {
        Node current  = head;
        while (index > 0) {
            current = current.next;
            index--;
        }
        return current;
    }

    private boolean isOutOfBounds(int index) {
        return index < 0 || index >= size;
    }

    public class OutOfBoundsException extends RuntimeException { }
}

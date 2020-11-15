package com.linkedlist.scratch;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        String _repr = "LinkedList::head\"+\"[\"+head.getValue()+\"]";
        return _repr;
    }

    public void append(Node node) {
        if(head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }


    public void append(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
        }
        Node current = head;
        while (current != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }
}


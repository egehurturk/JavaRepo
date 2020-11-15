package com.linkedlist.scratch;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(32);
        Node node1 = new Node(45);
        Node node2 = new Node(54);
        LinkedList ls = new LinkedList(head);
        ls.append(node1);
        System.out.println(ls.toString());
        ls.append(45);

    }

}

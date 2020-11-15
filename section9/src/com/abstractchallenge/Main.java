package com.abstractchallenge;

public class Main {
    public static void main(String[] args) {
        LinkingList list = new LinkingList(null);
        list.traverse(list.getRoot());

        String st = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = st.split(" ");
        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}

package org.example;

public class Node {
    int key;
    Node left, right, parent;

    public Node(int key) {
        this.key = key;
        left = right = parent = null;
    }
}

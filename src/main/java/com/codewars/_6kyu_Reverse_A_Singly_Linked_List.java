package com.codewars;

public class _6kyu_Reverse_A_Singly_Linked_List {
    
    private static class Node {
        
        private final int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next.value +
                    '}';
        }
    }
    
    public static Node reverse(Node node) {
        
        Node previous = null;
        
        while (node != null){
            
            Node next = node.next;
            node.next = previous;
            previous = node;
            node = next;
            
        }
        
        return previous;
    }
    
    public static void main(String[] args) {
        
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        System.out.println(n1);
        System.out.println(reverse(n1));
        
    }
    
}

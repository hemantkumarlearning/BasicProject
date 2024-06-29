
public class LinkList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // By default, new nodes don't point to anything
        }
    }
        public static void main(String[] args) {
            // Creating nodes
            Node node1 = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);

            // Linking nodes
            node1.next = node2;
            node2.next = node3;

            // Traversing the list
            Node current = node1;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

    }




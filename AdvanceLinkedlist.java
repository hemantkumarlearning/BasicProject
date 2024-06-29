public class AdvanceLinkedlist {

    static class Node {
        int data;
        Node next;

        // Constructor to create a new node with given data
        Node(int d) {
            data = d;
            next = null;
        }
    }

        static Node head; // head of list

        // Method to insert a new node at the beginning
        public static void insertAtHead(int newData) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
        }

        // Method to insert a new node at the end
        public static void insertAtTail(int newData) {
            Node newNode = new Node(newData);
            if (head == null) {
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        // Method to delete a node with given key
        public static void deleteNode(int key) {
            Node temp = head, prev = null;
            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) return;
            prev.next = temp.next;
        }

        // Method to search a given key in LinkedList
        public static boolean search(int key) {
            Node current = head;
            while (current != null) {
                if (current.data == key) {
                    return true; // key found
                }
                current = current.next;
            }
            return false; // key not found
        }

        // Method to display the linked list
        public static void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }


        public static void main(String[] args) {

            AdvanceLinkedlist.insertAtTail(1);
            AdvanceLinkedlist.insertAtTail(2);
            AdvanceLinkedlist.insertAtTail(3);
            AdvanceLinkedlist.insertAtHead(4);

            AdvanceLinkedlist.display(); // Output: 4 -> 1 -> 2 -> 3 -> null

            AdvanceLinkedlist.deleteNode(3);
            AdvanceLinkedlist.display(); // Output: 4 -> 1 -> 2 -> null

            System.out.println(AdvanceLinkedlist.search(2)); // Output: true
            System.out.println(AdvanceLinkedlist.search(5)); // Output: false

        }

    }
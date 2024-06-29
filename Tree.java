public class Tree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            left=null;
            right=null;
        }

    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    void printPreorder(Node node)
    {
        if (node == null)
            return;


        System.out.print(node.data + " ");


        printPreorder(node.left);


        printPreorder(node.right);
    }
    void printPostorder(Node node){
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(8);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        Node n6 = new Node(10);
        Node n7 = new Node(11);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        Tree tree = new Tree();
       // tree.printInorder(n1);
       // tree.printPreorder(n1);
        tree.printPostorder(n1);

    }
}

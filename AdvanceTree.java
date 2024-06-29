public class AdvanceTree {

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
Node root;
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    // A recursive function to insert a new value into BST
    private Node insertRecursive(Node root, int val) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // Otherwise, recur down the tree
        if (val < root.data) {
            // Insert into the left subtree
            root.left = insertRecursive(root.left, val);
        } else if (val > root.data) {
            // Insert into the right subtree
            root.right = insertRecursive(root.right, val);
        }

        // return the (unchanged) node pointer
        return root;
    }


    void printInorder(Node node){
        if (node==null)
            return;
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
    }
    void printPreorder(Node node){
        if (node==null)
            return;
        System.out.print(node.data+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder(Node node){
        if (node==null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        AdvanceTree tree = new AdvanceTree();
        tree.insert(5);
        tree.insert(6);
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(11);
        tree.printInorder(tree.root);
        System.out.println();
        tree.printPreorder(tree.root);
        System.out.println();
        tree.printPostorder(tree.root);
        System.out.println();

    }
}

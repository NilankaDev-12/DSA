class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BST {
    private Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        return data < root.data
                ? search(root.left, data)
                : search(root.right, data);
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class Q7_BinaryTree {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(50);
        bst.insert(30);
        bst.insert(60);
        bst.insert(90);
        bst.insert(20);
        bst.insert(10);

        bst.inorder();
        bst.preorder();
        bst.postorder();

        System.out.println(bst.search(60));
        System.out.println(bst.search(100));
    }
}
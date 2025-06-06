package demo;
class AVLNode {
    int key, height;
    AVLNode left, right;
    AVLNode(int d) {
        key = d;
        height = 1;

    }

}
public class AVLTreeExample {
    AVLNode root;
    
    int height(AVLNode N) {
    	
        return (N == null) ? 0 : N.height;
        
    }
    int max(int a, int b) {

        return (a > b) ? a : b;

    }
    AVLNode rightRotate(AVLNode y) {

        AVLNode x = y.left;

        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;

        x.height = max(height(x.left), height(x.right)) + 1;
        return x;

    }
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;

        AVLNode T2 = y.left;
        y.left = x;

        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;

        y.height = max(height(y.left), height(y.right)) + 1;
        return y;

    }
    int getBalance(AVLNode N) {

        return (N == null) ? 0 : height(N.left) - height(N.right);

    }

    AVLNode insert(AVLNode node, int key) {



        if (node == null)

            return new AVLNode(key);

        if (key < node.key)

            node.left = insert(node.left, key);

        else if (key > node.key)

            node.right = insert(node.right, key);

        else 

            return node;
        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key)

            return rightRotate(node);
        if (balance < -1 && key > node.right.key)

            return leftRotate(node);

        if (balance > 1 && key > node.left.key) {

            node.left = leftRotate(node.left);

            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {

            node.right = rightRotate(node.right);

            return leftRotate(node);

        }
        return node;

    }
    void inOrder(AVLNode node) {

        if (node != null) {

            inOrder(node.left);

            System.out.print(node.key + " ");

            inOrder(node.right);

        }

    }
    public void insert(int key) {

        root = insert(root, key);

    }
    public void printInOrder() {

        inOrder(root);

        System.out.println();

    }
    public static void main(String[] args) {

    	AVLTreeExample tree = new AVLTreeExample();
         int[] values = {10, 20, 30, 40, 50, 25};
        for (int val : values)
            tree.insert(val);
        System.out.println("In-order traversal of AVL Tree:");
        tree.printInOrder();

    }

}


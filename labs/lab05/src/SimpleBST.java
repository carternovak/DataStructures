// C343 / Fall 2021
//
// a very simple, starting BST class;
// it's so simple, it's named SimpleBST.


public class SimpleBST <K extends Comparable<?super K>> {
    BinaryNode<K> root;
    BinaryNode<K> current;

    // TODO for C343/Fall 2021 - Lab 05 Task B
    // "unbalanced" is used for balance checking:
    //    if a node is unbalanced, the tree will be unbalanced
    BinaryNode<K> unbalanced = null;

    public SimpleBST() {
        root = null;
        current = null;
    }
    public void build(K[] keys) {
        for (int i = 0; i < keys.length; i ++)
            insert(keys[i]);
    }
    public void insert(K k) {
        BinaryNode<K> tmpNode = new BinaryNode<K>(k);
        if (root == null) {
            root = current = tmpNode;
        } else {
            current = search(root, k);
            if (k.compareTo(current.getKey()) < 0)
                current.setLeft(tmpNode);
            else
                current.setRight(tmpNode);
        }
    }
    public BinaryNode<K> search(BinaryNode<K> entry, K k) {
        if (entry == null) {
            return null;
        } else {
            // update the size of the subtree by one:
            entry.setSize(entry.getSize() + 1);
            if (entry.isLeaf())
                return entry;
            if (k.compareTo(entry.getKey()) < 0) {
                if (entry.getLeft() != null)
                    return search(entry.getLeft(), k);
                else
                    return entry;
            } else {
                if (entry.getRight() != null)
                    return search(entry.getRight(), k);
                else
                    return entry;
            }
        }
    }
    public void display() {
        if (root == null) {
            return;
        }
        System.out.println("Pre-order enumeration: key(size-of-the-subtree)");
        traversePreOrder(root);
        System.out.println();

        System.out.println("In-order enumeration: key(size-of-the-subtree)");
        traverseInOrder(root);
        System.out.println();

        System.out.println("Post-order enumeration: key(size-of-the-subtree)");
        traversePostOrder(root);
        System.out.println();
    }
    public void traversePreOrder(BinaryNode<K> entry) {
        System.out.print(entry.getKey() + "(" + entry.getSize() + ") ");
        if (entry.getLeft() != null) traversePreOrder(entry.getLeft());
        if (entry.getRight() != null) traversePreOrder(entry.getRight());
    }

    // TODO for C343/Fall 2021 - Lab 05 Task B
    // implement balanceCheck(),
    //   and you may write heightAtNode(node) as helper function
    public boolean balanceCheck(BinaryNode<K> node)
    {
        int leftHeight;
        int rightHeight;

        if (node == null)
            return true;

        leftHeight = heightAtNode(node.getLeft());
        rightHeight = heightAtNode(node.getRight());

        if (Math.abs(leftHeight - rightHeight) <= 1 && balanceCheck(node.getLeft()) && balanceCheck(node.getRight()))
            return true;

        return false;
    }

    public int heightAtNode(BinaryNode<K> n) {
        if (n == null)
            return 0;

        return 1 + Math.max(heightAtNode(n.getLeft()), heightAtNode(n.getRight()));
    }

    // TODO for C343/Fall 2021 - Lab 05 Task C
    // implement traverseInOrder()
    public void traverseInOrder(BinaryNode<K> entry) {

        if (entry.getLeft() != null)
            traverseInOrder(entry.getLeft());
        System.out.print(entry.getKey() + "(" + entry.getSize() + ") ");
        if (entry.getRight() != null)
            traverseInOrder(entry.getRight());
    }
    // implement traversePostOrder()
    public void traversePostOrder(BinaryNode<K> entry) {

        if (entry.getLeft() != null)
            traversePostOrder(entry.getLeft());
        if (entry.getRight() != null)
            traversePostOrder(entry.getRight());
        System.out.print(entry.getKey() + "(" + entry.getSize() + ") ");
    }


    public static void main(String[] argv) {
        SimpleBST<Integer> tree = new SimpleBST<Integer>();
        Integer[] keys = {2, 4, 6, 8, 10, 3, 5, 7, 9, 11, 12, -10, -20, 100};
        tree.build(keys);
        tree.display();

        System.out.println("Height of the root: " + tree.heightAtNode(tree.root));
        System.out.println("Balance Check: " + tree.balanceCheck(tree.root));

        // TODO for C343/Fall 2021 - Lab Task 05 Task B and C
        // see instructions
        
        System.out.println("Test Case 2 -----------------");
        SimpleBST<Integer> tree2 = new SimpleBST<Integer>();
        Integer[] keys2 = {36, 24, 13, 27, 49, 42, 53, 39, 45};
        tree2.build(keys2);
        tree2.display();

        System.out.println("Height of the root: " + tree2.heightAtNode(tree2.root));
        System.out.println("Balance Check: " + tree2.balanceCheck(tree2.root));



    }
}
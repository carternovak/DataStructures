// C343 / Fall 2021
//
// a very simple, starting binary node class;
// it's so simple, it's named SimpleBinaryNode.

public class SimpleBinaryNode <E extends Comparable<?super E>> {
    private E value;                     // value-only, no key
    private SimpleBinaryNode<E> left;    // left child
    private SimpleBinaryNode<E> right;   // right child

    public SimpleBinaryNode(E e) {
        value = e;
        left = right = null;
    }

    public void setLeft(SimpleBinaryNode<E> node) {
        left = node;
    }

    public void setRight(SimpleBinaryNode<E> node) {
        right = node;
    }

    public boolean find(E q) {

        if(this.value == q)
            return true;

        if (this.left != null)
            if (this.left.find(q))
                return true;

        if (this.right != null)
            if (this.right.find(q))
                return true;

        return false;
    }

    public static void main(String[] argv) {

        SimpleBinaryNode<Integer> root = new SimpleBinaryNode<Integer>(7);
        SimpleBinaryNode<Integer> node1 = new SimpleBinaryNode<Integer>(48);
        SimpleBinaryNode<Integer> node2 = new SimpleBinaryNode<Integer>(41);
        SimpleBinaryNode<Integer> node3 = new SimpleBinaryNode<Integer>(75);
        SimpleBinaryNode<Integer> node4 = new SimpleBinaryNode<Integer>(39);
        SimpleBinaryNode<Integer> node5 = new SimpleBinaryNode<Integer>(58);
        SimpleBinaryNode<Integer> node6 = new SimpleBinaryNode<Integer>(28);
        SimpleBinaryNode<Integer> node7 = new SimpleBinaryNode<Integer>(50);
        SimpleBinaryNode<Integer> node8 = new SimpleBinaryNode<Integer>(30);
        SimpleBinaryNode<Integer> node9 = new SimpleBinaryNode<Integer>(86);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        node2.setRight(node6);
        node3.setLeft(node7);
        node3.setRight(node8);
        node4.setLeft(node9);


        SimpleBinaryNode<Integer> rootB = new SimpleBinaryNode<Integer>(7);

        SimpleBinaryNode<Integer> nodeA = new SimpleBinaryNode<Integer>(29);
        SimpleBinaryNode<Integer> nodeB = new SimpleBinaryNode<Integer>(36);
        rootB.setLeft(nodeA);
        rootB.setRight(nodeB);


        // find() needs to be implemented
        System.out.println("is 39 found in the tree: " + root.find(39));
        // find(36) should return true
        System.out.println("is 103 found in the tree: " + root.find(103));
        // find(103) should return false
        System.out.println("is 48 found in the tree: " + root.find(48));
        System.out.println("is 58 found in the tree: " + root.find(58));
        System.out.println("is 98 found in the tree: " + root.find(98));


    } // end of main()

} // end of SimpleBinaryNode class
class BinaryTree {

    Node root;

    public BinaryTree()
    {
        root = null;
    }

    public void levelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            treeAtLevel(root, i);
    }

    public int height(Node root)
    {
        if (root == null)
            return 0;
        else
            {
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if (lHeight > rHeight)
                return (lHeight + 1);
            else return (rHeight + 1);
        }
    }

    public void treeAtLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.info + " ");
        else if (level > 1) {
            treeAtLevel(root.left, level - 1);
            treeAtLevel(root.right, level - 1);
        }
    }

    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.levelOrder();
    }

}
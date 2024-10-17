import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public TreeNode search(int value) {
        return searchRec(root, value);
    }

    private TreeNode searchRec(TreeNode root, int value) {
        if (root == null || root.value == value) {
            return root;
        }
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private TreeNode deleteRec(TreeNode root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = findMin(root.right).value;
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    public TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public TreeNode findMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public int height() {
        return heightRec(root);
    }

    private int heightRec(TreeNode node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(heightRec(node.left), heightRec(node.right));
    }

    public boolean isBalanced() {
        return isBalancedRec(root) != -1;
    }

    private int isBalancedRec(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = isBalancedRec(node.left);
        int rightHeight = isBalancedRec(node.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.value + " ");
            inOrderRec(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrderRec(root);
    }

    private void preOrderRec(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrderRec(root);
    }

    private void postOrderRec(TreeNode node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRec(node.left) + countNodesRec(node.right);
    }

    public void clear() {
        root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(51);
        bst.insert(31);
        bst.insert(21);
        bst.insert(41);
        bst.insert(76);
        bst.insert(61);
        bst.insert(85);

        System.out.println("In-order Traversal:");
        bst.inOrderTraversal();

        System.out.println("\nPre-order Traversal:");
        bst.preOrderTraversal();

        System.out.println("\nPost-order Traversal:");
        bst.postOrderTraversal();

        System.out.println("\nLevel-order Traversal:");
        bst.levelOrderTraversal();

        System.out.println("\nSearch for 41: " + (bst.search(41) != null));
        System.out.println("Height of the tree: " + bst.height());
        System.out.println("Count of nodes: " + bst.countNodes());

        bst.delete(21);
        System.out.println("In-order Traversal after deleting 21:");
        bst.inOrderTraversal();

        bst.delete(31);
        System.out.println("\nIn-order Traversal after deleting 31:");
        bst.inOrderTraversal();

        bst.delete(51);
        System.out.println("\nIn-order Traversal after deleting 51:");
        bst.inOrderTraversal();

        System.out.println("\nIs the tree balanced? " + bst.isBalanced());
        bst.clear();
        System.out.println("Tree cleared. Count of nodes after clear: " + bst.countNodes());
    }
}

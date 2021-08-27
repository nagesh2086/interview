package binary.tree;

public class Tree {
	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(Node node, int value) {
		if (node.value > value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				System.out.println("Inserted " + value + " to the left of " + node.value);
				Node element = new Node(value);
				node.left = element;
			}
		} else if (node.value < value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("Inserted " + value + " to the right of " + node.value);
				Node element = new Node(value);
				node.right = element;
			}
		}
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}

	/* function to print level order traversal of tree */
	void printLevelOrder(Node root) {
		int h = height(root);
		int i;
		//h = 5;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	int height(Node root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at the given level */
	void printGivenLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.value + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		Node root = new Node(5);
		System.out.println("Binary Tree implementation");
		System.out.println("root node created: " + root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		System.out.println("Traversing IN order: ");
		tree.traverseInOrder(root);
		System.out.println("\nTraversing PRE order: ");
		tree.traversePreOrder(root);
		System.out.println("\nTraversing POST order: ");
		tree.traversePostOrder(root);
		System.out.println("\nBreadth First Search: ");
		tree.printLevelOrder(root);
	}

}

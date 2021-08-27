package binary.tree;

public class BinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(5);
		System.out.println("Root node has been created: " + root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);

		System.out.println("IN-ORDER:");
		tree.traverseInOrder(root);
		System.out.println("\nPRE-ORDER:");
		tree.traversePreOrder(root);
		System.out.println("\nPOST-ORDER:");
		tree.traversePostOrder(root);
		System.out.println("\nLevel Order BFS traversal: ");
		tree.printLevelOrder(root);
		System.out.println("\nHeight: " + tree.height(root));
	}

	private void insert(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				node.left = new Node(value);
				System.out.println(value + " inserted to the left of node: " + node.value);
			}

		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				node.right = new Node(value);
				System.out.println(value + " inserted to the right of node: " + node.value);
			}
		}
	}

	private void traverseInOrder(Node root) {
		if (root != null) {
			traverseInOrder(root.left);
			System.out.print(root.value + " ");
			traverseInOrder(root.right);
		}
	}

	private void traversePreOrder(Node root) {
		if (root != null) {
			System.out.print(root.value + " ");
			traversePreOrder(root.left);
			traversePreOrder(root.right);
		}
	}

	private void traversePostOrder(Node root) {
		if (root != null) {
			traversePostOrder(root.left);
			traversePostOrder(root.right);
			System.out.print(root.value + " ");
		}
	}

	private void printLevelOrder(Node root) {
		if (root == null) {
			return;
		}
		int i = 1;
		int h = height(root);
		for (int j = i; j <= h; j++) {
			printCurrentLevel(root, j);
		}
	}

	private void printCurrentLevel(Node node, int j) {
		if (node == null) {
			return;
		}
		if (j == 1) {
			System.out.print(node.value + " ");
		} else if (j > 1) {
			printCurrentLevel(node.left, j - 1);
			printCurrentLevel(node.right, j - 1);
		}
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			if (lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
	}

	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}
}

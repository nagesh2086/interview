package reverse.doubly.linked.list;

public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		Node listHead = new Node(1);
		Node listTail = listHead;
		listTail = new Node(2);
		appendNode(listHead, listTail);
		listTail = new Node(3);
		appendNode(listHead, listTail);
		listTail = new Node(4);
		appendNode(listHead, listTail);

		printLList(listHead);

		Node newHead = reverseByStartingHead(listHead);
		printLList(newHead);
		// reverseByStartingTail(listTail);

	}

	public static Node reverseByStartingHead(Node listHead) {
		Node newHead = listHead;
		Node p = listHead;
		while (p != null) {
			Node t = p.getNext();
			p.setNext(p.getPrev());
			p.setPrev(t);
			newHead = p;
			p = t;
		}

		System.out.println();
		return newHead;
	}

	private static void reverseByStartingTail(Node oldListTail) {
		Node listHead = null;

		while (oldListTail != null) {
			Node tempTail = oldListTail;
			oldListTail = remove(oldListTail);
			listHead = appendNode(listHead, tempTail);
		}

		System.out.println();
		printLList(listHead);
	}

	public static Node remove(Node listTail) {
		Node temp = listTail.getPrev();
		listTail.setNext(null);
		if (listTail.getPrev() != null) {
			listTail.getPrev().setNext(null);
		}
		listTail.setPrev(null);
		return temp;
	}

	private static void printLList(Node listHead) {
		if (listHead != null) {
			do {
				System.out.print(listHead.getData() + " ");
				listHead = listHead.getNext();
			} while (listHead != null);
		}
	}

	private static Node appendNode(Node head, Node node) {
		Node tempHead = head;
		if (tempHead == null) {
			tempHead = node;
			return node;
		}
		while (tempHead.getNext() != null) {
			tempHead = tempHead.getNext();
		}

		tempHead.setNext(node);
		node.setPrev(tempHead);
		return head;
	}
}

class Node {
	private int data;
	private Node next;
	private Node prev;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
package linked.list;

import java.util.HashMap;

public class LListRandomDeepClone {

	public static void main(String[] args) {
		LListRandomDeepClone app = new LListRandomDeepClone();
		NodeR root = new NodeR(1, null);
		NodeR A = new NodeR(10, null);
		NodeR B = new NodeR(100, null);
		NodeR C = new NodeR(1000, null);
		NodeR D = new NodeR(10000, null);
		root.setNext(A);
		root.setRandom(B);
		A.setNext(B);
		A.setRandom(C);
		B.setNext(C);
		B.setRandom(D);
		C.setNext(D);

		System.out.println("Original_________________");
		app.printLList(root);

		System.out.println("DeepCopy_________________");
		app.printLList(app.createDeepClone(root, new HashMap<NodeR, NodeR>(), null));
	}

	private void printLList(NodeR root) {
		if (root != null) {
			System.out.println(root + " : " + root.getNext() + " : " + root.getRandom());
			printLList(root.getNext());
		}
	}

	private NodeR createDeepClone(NodeR root, HashMap<NodeR, NodeR> holder, NodeR previous) {
		NodeR newNodeR = null;
		if (root != null) {
			newNodeR = new NodeR(root.getData(), root.getNext());
			if (previous != null) {
				previous.setNext(newNodeR);
			}
			previous = newNodeR;
			if (holder.containsKey(root)) {
				NodeR randomValue = holder.get(root);
				if (randomValue != null) {
					randomValue.setRandom(newNodeR);
				}
			}
			if (root.getRandom() != null) {
				holder.put(root.getRandom(), newNodeR);
			}
			createDeepClone(root.getNext(), holder, previous);
		}
		return newNodeR;
	}
}

class NodeR implements Cloneable {
	private Integer data;
	private NodeR next;
	private NodeR random;

	public NodeR(Integer data, NodeR next) {
		this.data = data;
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public NodeR getNext() {
		return next;
	}

	public void setNext(NodeR next) {
		this.next = next;
	}

	public NodeR getRandom() {
		return random;
	}

	public void setRandom(NodeR random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

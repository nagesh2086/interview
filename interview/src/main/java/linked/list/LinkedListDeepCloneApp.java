package linked.list;

public class LinkedListDeepCloneApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedListDeepCloneApp app = new LinkedListDeepCloneApp();
		NodeL root = new NodeL(1, null);
		NodeL A = new NodeL(10, null);
		NodeL B = new NodeL(100, null);
		NodeL C = new NodeL(1000, null);
		NodeL D = new NodeL(10000, null);
		root.setNext(A);
		A.setNext(B);
		B.setNext(C);
		C.setNext(D);

		System.out.println("Original_______________");
		app.printLList(root);
		
		System.out.println(root);
		
		NodeL dClonedRoot = app.createDeepClone(root);
		
		System.out.println("ClonedLList_______________");
		app.printLList(dClonedRoot);
		
		System.out.println("UsingCloneMethod______________");
		NodeL clone = (NodeL)root.clone();
		System.out.println(clone);
		
		System.out.println("recursiveDeepClone________________");
		app.printLList(app.recursiveDeepClone(root, null));
	}

	private NodeL createDeepClone(NodeL root) {
		NodeL previousN = null;
		boolean firstN = true;
		NodeL newRoot = null;
		while (root != null) {
			NodeL newN = new NodeL(root.getData(), root.getNext());
			if (firstN) {
				newRoot = newN;
				firstN = false;
			}
			if (previousN != null) {
				previousN.setNext(newN);
			}
			previousN = newN;
			root = root.getNext();
		}
		return newRoot;
	}
	
	private NodeL recursiveDeepClone(NodeL root, NodeL previousN) {
		if(root != null) {
			NodeL newN = new NodeL(root.getData(), root.getNext());
			if (previousN != null) {
				previousN.setNext(newN);
			}
			recursiveDeepClone(root.getNext(), newN);
			return newN;
		}
		return null;
	}

	private void printLList(NodeL root) {
		while (root != null) {
			System.out.println(root);
			root = root.getNext();
		}
	}

}

class NodeL implements Cloneable {
	private Integer data;
	private NodeL next;

	public NodeL(Integer data, NodeL next) {
		this.data = data;
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public NodeL getNext() {
		return next;
	}

	public void setNext(NodeL next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +" : " +this.getData() +" : " + this.getNext();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

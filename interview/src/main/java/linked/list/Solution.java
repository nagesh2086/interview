package linked.list;

import java.util.HashMap;
import java.util.Map;

// Definition for a Node.
class NodeS {
	int val;
	NodeS next;
	NodeS random;

	public NodeS(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
	
	/*@Override
	public String toString() {
		return "[ " + super.toString() +" : " +this.val +" : " + this.next + " : " + this.random + " ]";
	}*/
}

public class Solution {
	public static void main(String args[]) {
		NodeS root = new NodeS(1);
		NodeS A = new NodeS(10);
		NodeS B = new NodeS(100);
		/*NodeS C = new NodeS(1000);
		NodeS D = new NodeS(10000);*/
		root.next = A;
		root.random = B;
		A.next = B;
		/*A.random = C;
		B.next = C;
		B.random = D;
		C.next = D;*/
		
		Solution s = new Solution();
		s.printLList(root);
		
		System.out.println("After_____________________");
		s.printLList(s.copyRandomList(root));
	}

	private void printLList(NodeS root) {
		while (root != null) {
			System.out.println(root);
			root = root.next;
		}
	}
	
	public NodeS copyRandomList(NodeS head) {
		NodeS copy = new NodeS(-1);
		NodeS copy2 = copy;
		recursive(head, new HashMap<NodeS, NodeS>(), copy2);
		return copy.next;
	}

	public void recursive(NodeS node, Map<NodeS, NodeS> map, NodeS copy) {
		if (node == null)
			return;
		copy.next = new NodeS(node.val);
		map.put(node, copy.next);
		recursive(node.next, map, copy.next);
		copy.next.random = map.get(node.random);
	}
}
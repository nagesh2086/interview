import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetCmTest {

	public static void main(String[] args) {
		/*TreeSet<Element> treeSet = new TreeSet<>();
		treeSet.add(new Element(0));
		treeSet.add(new Element(1));*/

		HashSet<Element> hashSet = new HashSet<>();
		hashSet.add(new Element(0));
		hashSet.add(new Element(1));
		hashSet.add(new Element(1));
		System.out.println(hashSet);
	}

	static class Element {
		int id;

		public Element(int id) {
			this.id = id;
		}
		
		@Override
		public String toString() {
			return "id=" + id;
		}
	}
}

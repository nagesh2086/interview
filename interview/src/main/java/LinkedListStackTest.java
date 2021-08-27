import java.util.LinkedList;

public class LinkedListStackTest {

	public static void main(String[] args) {
LinkedList<Integer>linkList = new LinkedList<Integer>();
linkList.push(10);
linkList.add(100);
linkList.add(1);
linkList.add(6);

System.out.println(linkList);
System.out.println("peek: " + linkList.peek());
System.out.println("pop: (6): " + linkList.pop());
System.out.println("pop: (1): " + linkList.pop());
	}

}

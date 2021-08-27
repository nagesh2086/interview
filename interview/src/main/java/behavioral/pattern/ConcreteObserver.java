package behavioral.pattern;

public class ConcreteObserver implements Observer {
	private Object observerState;

	public void update(String event) {
System.out.println("this " + event + " has been onserved.");
	}

	public static void main(String[] args) {

	}

}

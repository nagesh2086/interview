package behavioral.pattern;

public class ObserverClient {

	public static void main(String[] args) {
		Observer o1 = new ConcreteObserver();

		Subject s1 = new ConcreteSubject();
		s1.attach(o1);
		s1.notifyObserver("Click event");
		s1.detach(o1);
		s1.notifyObserver("Click event");
	}

}

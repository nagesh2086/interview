package behavioral.pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private Object subjectState;
	private List<Observer> observerList = new ArrayList<Observer>();

	public void attach(Observer o) {
		observerList.add(o);
	}

	public void detach(Observer o) {
		observerList.remove(o);
	}

	public void notifyObserver(String event) {
		for (Observer observer : observerList) {
			observer.update(event);
		}
	}

	public static void main(String[] args) {

	}

}

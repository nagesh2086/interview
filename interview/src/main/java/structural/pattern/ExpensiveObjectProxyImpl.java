package structural.pattern;

public class ExpensiveObjectProxyImpl implements ExpensiveObject {
	private ExpensiveObjectImpl object = new ExpensiveObjectImpl();

	@Override
	public void process() {
		object.process();
	}

}

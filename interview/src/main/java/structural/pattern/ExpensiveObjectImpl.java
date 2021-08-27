package structural.pattern;

public class ExpensiveObjectImpl implements ExpensiveObject {

	public ExpensiveObjectImpl() {
		heavyExpensiveObjectInitialization();
	}
	
	private void heavyExpensiveObjectInitialization() {
		System.out.println("Heavy Initialization...");
	}
	@Override
	public void process() {
		System.out.println("Heavy processing...");
	}

}

package behavioral.pattern;

public class ConcreteStrategyB implements Strategy {

	public void execute() {
		System.out.println(this.getClass().getCanonicalName() + " executed");
	}

}

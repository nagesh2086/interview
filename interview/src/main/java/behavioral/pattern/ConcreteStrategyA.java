package behavioral.pattern;

public class ConcreteStrategyA implements Strategy {

	public void execute() {
		System.out.println(this.getClass().getCanonicalName() + " executed");
	}

}

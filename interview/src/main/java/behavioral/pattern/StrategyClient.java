package behavioral.pattern;

public class StrategyClient {

	public enum StrategyType {
		A, B;
	}

	public static void main(String[] args) {
		Strategy csa = new ConcreteStrategyA();
		Strategy csb = new ConcreteStrategyB();

		StrategyType st = StrategyType.A;
		switch (st) {
		case A:
			csa.execute();
			break;
		case B:
			csb.execute();
			break;
		}
	}
}

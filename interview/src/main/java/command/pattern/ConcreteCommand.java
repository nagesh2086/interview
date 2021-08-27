package command.pattern;

public class ConcreteCommand implements Command {

	private Receiver receiver = null;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("Concrete command asking receiver to perform actions");
		receiver.action();
	}

}

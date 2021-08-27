package command.pattern;

public class Invoker {
private Command command = null;

public Invoker(Command command) {
	this.command = command;
}

public void action(){
	System.out.println("Invoker is asking command to execute action");
	command.execute();
}
}


public class InterfaceABImpl implements InterfaceA, InterfaceB{

	public static void main(String[] args) {
		InterfaceA iabimpl = new InterfaceABImpl();
		iabimpl.foo();
		//iabimpl.goo();
		
		InterfaceB iabimpl1 = new InterfaceABImpl();
		iabimpl1.foo();
		iabimpl1.goo();
	}

	public void goo() {
		System.out.println("InterfaceABImpl goo() only on impl");
	}

	public void foo() {
		System.out.println("InterfaceABImpl foo() only on impl");
	}

}

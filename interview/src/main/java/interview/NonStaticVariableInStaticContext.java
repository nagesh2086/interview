package interview;

public class NonStaticVariableInStaticContext {
	private static int intStatic = 0;
	private int intInstance = 0;

	public static void main(String[] args) {
		System.out.println(intStatic);
		// System.out.println(intInstance);

		staticMethod1();
		// nonStaticMethod1();
		NonStaticVariableInStaticContext.staticMethod1();
		
		NonStaticVariableInStaticContext nsvisc = new NonStaticVariableInStaticContext();
		System.out.println(nsvisc.intInstance);
		nsvisc.nonStaticMethod1();
	}

	private static void staticMethod1() {

	}

	private void nonStaticMethod1() {

	}
}

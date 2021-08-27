package method.overloading;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		
		int i = 0;
		Integer intObj = 1;
		Object obj = "Object";
		Double d = 98d;
		Integer intNullObj = null;
		
		mo.display(i);
		mo.display(intObj);
		//mo.display(obj);
		//mo.display(d);
		mo.display(intNullObj);
		//mo.display(null);
	}

}

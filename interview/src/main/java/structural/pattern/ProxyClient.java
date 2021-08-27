package structural.pattern;

public class ProxyClient {

	public static void main(String[] args) {
		ExpensiveObject expObj = new ExpensiveObjectProxyImpl();
		expObj.process();
		expObj.process();
	}

}

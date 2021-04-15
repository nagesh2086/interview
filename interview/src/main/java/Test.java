public class Test {
	public static void main(String[] args) {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
		double dResult = 1.0/0.0;
		System.out.println(dResult);
		int iResult = 1/0;
		System.out.println(iResult);
	}
}


public class PrimeNumberUptoIncluding100 {

	public static void main(String[] args) {
		int n = 0;
		while (n <= 100) {
			boolean primeFlag = true;
			if (n == 0 || n == 1) {
				primeFlag = false;
			} else {
				int k = n / 2;
				for (int i = 2; i <= k; i++) {
					if (n % i == 0) {
						primeFlag = false;
						break;
					} else {
						primeFlag = true;
					}
				}
			}

			if (primeFlag) {
				System.out.println(n + " is prime");
			} else {
				System.out.println(n + " is not prime");
			}
			n++;
		}

	}

}

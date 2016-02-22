package p3;

import java.util.ArrayList;

public class P3 {

	public static void main(String[] args) {
		Long l = Long.valueOf("600851475143");
		maxPrime(l);
	}

	private static void maxPrime(Long n) {
		java.util.List<Long> primeFactors = new ArrayList<>();
		for (int i = 2; i <= (n / 2); i++) {

			if (n % i == 0) {
				checkPrime(i);
			}
		}
	}

	private static void checkPrime(int i) {
		// TODO Auto-generated method stub

	}
}

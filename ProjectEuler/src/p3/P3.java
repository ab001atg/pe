package p3;

public class P3 {

	public static void main(String[] args) {
		Long l = Long.valueOf("600851475143");
		maxPrime(l);
	}

	private static void maxPrime(Long n) {
		Long maxPrime = -1L;
		for (long i = 2; i <= (n / 2); i++) {
			if ((n % i == 0) && checkPrime(i) && i > maxPrime) {
				maxPrime = i;
			}
		}
		if (maxPrime.equals(-1L)) {
			maxPrime = n;
		}
		System.out.println(maxPrime);
	}

	private static boolean checkPrime(long i) {
		for (int x = 2; x <= Math.sqrt(i); x++) {
			if (i % x == 0) {
				return false;
			}
		}
		return true;
	}
}


//Só um comentário

public class GeneratePrime {

	private boolean isPrimeMethod(int i) {
		int j;
		boolean isPrime = true;

		for (j = 2; isPrime && j < i; j++) {
			if ((i % j) == 0) {
				isPrime = false;
			}
		}

		return isPrime;
	}

	//Segundo comentário

	public static void main(String[] args) {

        int i, j;
        boolean isPrime;
        
        System.out.println("Generating primes...");
        
        for (i = 2; i < 1000; i++) {
            if (isPrimeMethod(i)) {
            	System.out.println(i + " is prime.");
            }
        }
	}

}
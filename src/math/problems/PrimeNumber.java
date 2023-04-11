package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		List<Integer> primeNumbers = new ArrayList<>();

		primeNumbers.add(2);

		for (int numberToCheck = 3; numberToCheck <= 1000000 ; numberToCheck+=2) {

			boolean isPrime = true;

			for (int factor = 2; factor <= Math.sqrt(numberToCheck) ; factor++) {
				if (numberToCheck % factor == 0){
					isPrime = false;
					break;
				}
			}
			if (isPrime){
				primeNumbers.add(numberToCheck);
			}

		}
		System.out.println("Prime numbers from 2 to 1 million are: ");
		for (int number :primeNumbers) {
			System.out.print(number + ", ");
		}
	}
}



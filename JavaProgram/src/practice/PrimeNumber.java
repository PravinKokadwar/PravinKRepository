package practice;

import java.io.*;

class Primes {
	static boolean prime(long num) // To test and return true if number is prime.

	{
		boolean isprime = true; // Initially isprime is true, it becomes false if number is not prime
		for (int i = 2; i <= num - 1; i++) // from 2 to num-1, if any number divide number then it is not prime
			if (num % i == 0)
				isprime = false; // if remaining is zero after divide by any number, then that number is prime
									// no.
		return isprime;
	}

	static void generate(long max) // this method should accept how many prime required into max & c is counter for
									// no. of prime generated
	{
		long c = 1, num = 2;
		while (c < max) {
			if (prime(num)) // call prime() method directly.
			{

				System.out.println(num);
				++c;
			}
			++num;
		}
	}
}

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // accept the number of prime as
																					// needed.
		System.out.println("How many primes?");
		int max = Integer.parseInt(br.readLine());
		Primes.generate(max); // generate max no. of primes.
	}
}

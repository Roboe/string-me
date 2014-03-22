package programame2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 */
public class FPor3Mas5 {
	/*
	 * TODO Sigue tardando bastante con números muy grandes terminados en 0, 2,
	 * 5 y 7
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while (!(input = br.readLine()).equals("0")) {
			long numero = Long.parseLong(input);
			System.out.println((isPossible(numero)) ? "SI" : "NO");
		}
	}

	private static boolean isPossible(long n) {
		long c = n % 10;
		if (c == 1 || c == 3 || c == 6 || c == 8 || c == 9)
			return true;
		else if (n - 5 > 0 && isPossible(n - 5))
			return true;
		else if (n % 3 == 0 && isPossible(n / 3))
			return true;
		else
			return false;
	}
}

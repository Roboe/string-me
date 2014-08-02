package prgrmm14.madrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 * @see https://www.aceptaelreto.com/problem/statement.php?id=190
 * @result AC p1 t2.743 m3584
 */
public class DFactoriales {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		long num1 = 0, num2 = 0;
		do {
			input = br.readLine();
			num1 = Long.parseLong(input.split(" ")[0]);
			num2 = Long.parseLong(input.split(" ")[1]);

			if (num1 >= num2) {
				long res = 1;
				for (long i = num1; i > num2; i--) {
					res *= i;
				}
				System.out.println(res);
			}
		} while (num1 >= num2);
	}
}

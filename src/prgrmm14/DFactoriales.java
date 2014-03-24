package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.Entrada;

/**
 * @author Roboe
 */
public class DFactoriales {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				Entrada.getEntrada(Entrada.PRGRMM14, "D")));
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

		// System.out.println("Bye!");
	}
}

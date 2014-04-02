package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 * @see https://www.aceptaelreto.com/problem/statement.php?id=192
 * @result AC p1 t0.89 m3136
 */
public class FPor3Mas5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while (!(input = br.readLine()).equals("0")) {
			int numero = Integer.parseInt(input);
			System.out.println((isPossible(numero)) ? "SI" : "NO");
		}
	}

	private static boolean isPossible(int n) {
		if (resultados[n] == null) {
			long c = n % 10;
			if (c == 1 || c == 3 || c == 6 || c == 8 || c == 9
					|| (c == 4 && n > 5))
				resultados[n] = Estado.POSIBLE;
			else if (n % 3 == 0 && isPossible(n / 3))
				resultados[n] = Estado.POSIBLE;
			else if (n - 5 > 0 && isPossible(n - 5))
				resultados[n] = Estado.POSIBLE;
			else
				resultados[n] = Estado.NO_POSIBLE;
		}
		return resultados[n].toBoolean();
	}

	private static Estado[] resultados = new Estado[20001];
}

enum Estado {
	NO_POSIBLE {
		public boolean toBoolean() {
			return false;
		}
	},
	POSIBLE {
		public boolean toBoolean() {
			return true;
		}
	};

	abstract boolean toBoolean();

}
package acptalrto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 * @link https://www.aceptaelreto.com/problem/statement.php?id=138
 * @result AC
 */
public class N138CerosFactorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double casos = Double.parseDouble(br.readLine());
		double[] numeroCeros = new double[(int) casos];
		for (int i = 0; i < numeroCeros.length; i++) {
			double d = Double.parseDouble(br.readLine());
			double numero = 0;
			do {
				d = d / 5;
				numero += (int) d;
			} while (d >= 5);
			numeroCeros[i] = numero;
		}

		for (double i : numeroCeros) {
			System.out.println((int) i);
		}

	}

}

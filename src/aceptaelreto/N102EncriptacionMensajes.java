package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Roboe
 * @link https://www.aceptaelreto.com/problem/statement.php?id=102
 * @result AC
 */
public class N102EncriptacionMensajes {

	private static int abc = 'z' - 'a' + 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input;
		ArrayList<Integer> salida = new ArrayList<Integer>();
		int clave;
		do {
			int vocales = 0;
			input = br.readLine().toCharArray();
			clave = comprobarClave(input[0]);
			for (int i = 1; i < input.length; i++) {
				if (input[i] >= 'A' && input[i] <= 'Z') {
					input[i] -= clave;
					if (input[i] < 'A') {
						input[i] += abc;
					} else if (input[i] > 'Z') {
						input[i] -= abc;
					}
				} else if (input[i] >= 'a' && input[i] <= 'z') {
					input[i] -= clave;
					if (input[i] < 'a') {
						input[i] += abc;
					} else if (input[i] > 'z') {
						input[i] -= abc;
					}
				}
				// System.out.println(input[i]);
				if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i'
						|| input[i] == 'o' || input[i] == 'u'
						|| input[i] == 'A' || input[i] == 'E'
						|| input[i] == 'I' || input[i] == 'O'
						|| input[i] == 'U') {
					vocales++;
				}
			}
			salida.add(Integer.valueOf(vocales));

		} while (input.length != 4
				|| !(input[1] == 'F' && input[2] == 'I' && input[3] == 'N'));
		salida.remove(salida.size() - 1);
		for (Integer i : salida) {
			System.out.println(i);
		}

	}

	private static int comprobarClave(char c) {
		int clv = c - 'p';
		// System.out.println(clv);
		while (Math.abs(clv) >= abc) {
			clv = (clv < 0) ? clv + abc : clv - abc;
		}
		// System.out.println(clv);
		return clv;
	}
}

package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.Entrada;

/**
 * @author Roboe
 */
public class JSudokus {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				Entrada.getEntrada(Entrada.PRGRMM14, "J")));
		int casos = Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++) {
			String input = br.readLine();
			for (int j = 0; j < 9; j++) {
				input = input.concat(br.readLine());
			}
			char[] sudoku = input.toCharArray();
			boolean valido = true;
			int numeros = 0;
			// (length+1)/2 para que compruebe hasta el centro incluido (por si
			// es la diferencia entre 32 y 33)
			for (int j = 0; j < (sudoku.length + 1) / 2 && valido; j++) {
				if (sudoku[j] != '-' && sudoku[sudoku.length - 1 - j] != '-') {
					numeros += 2;
				} else if (sudoku[j] == '-'
						&& sudoku[j] == sudoku[sudoku.length - 1 - j]) {
				} else {
					valido = false;
				}
				if (valido && numeros > 32) {
					valido = false;
				}
			}
			System.out.println((valido) ? "SI" : "NO");
		}
	}

}

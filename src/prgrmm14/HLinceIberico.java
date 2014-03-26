package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.Entrada;

/**
 * @author Roboe
 */
public class HLinceIberico {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				Entrada.getEntrada(Entrada.PRGRMM14, "H")));
		int casos = Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++) {
			char[] input = br.readLine().toCharArray();
			int vallas = 0;
			for (int j = 0; j < input.length; j++) {
				// System.out.print(j + " ");
				if (input[j] == '.') {
					vallas++;
					j += 2;
				}
			}
			System.out.println(vallas);
		}
	}

}

package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import util.Entrada;

/**
 * @author Roboe
 */
public class ISaltosTrampolin {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				Entrada.getEntrada(Entrada.PRGRMM14, "I")));
		String input;
		while ((input = br.readLine()) != null) {
			String[] puntuaciones = input.split(" ");
			Arrays.sort(puntuaciones);
			System.out.printf("%.0f\n", (Double.parseDouble(puntuaciones[2])
					+ Double.parseDouble(puntuaciones[3]) + Double
					.parseDouble(puntuaciones[4])) * 2);
		}
	}
}

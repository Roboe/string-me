package prgrmm14.nacional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author usraux
 * @see https://www.aceptaelreto.com/problem/statement.php?id=208&cat=77
 * @result AC
 */
public class DTirandoBolos {

	// public static int filas[] = new int[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while (!(linea = br.readLine()).equals("0 0")) {
			String[] s = linea.split(" ");
			int numFil = Integer.parseInt(s[0]);
			int fila = Integer.parseInt(s[1]);

			int tirados = 0;
			for (int i = numFil; i > (numFil - fila) + 1; i--) {
				tirados += numFil - (numFil - i);
			}
			System.out.println(tirados);
		}
	}
}

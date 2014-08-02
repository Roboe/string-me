package prgrmm14.nacional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author usraux
 * @see https://www.aceptaelreto.com/problem/statement.php?id=214&cat=77
 * @result AC
 */
public class JAbdicacionRey {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while (!br.readLine().equals("0")) {
			String[] noms1 = br.readLine().split(" ");
			int[] numSuc = new int[Integer.parseInt(br.readLine())];
			String[] noms2 = br.readLine().split(" ");
			int i = 0;

			for (String nom2 : noms2) {
				for (String nom1 : noms1) {
					if (nom2.equals(nom1)) {
						numSuc[i]++;
					}
				}
				int j = 0;
				for (String nom3 : noms2) {
					if (nom3.equals(nom2) && i > j) {
						numSuc[i]++;
					}
					j++;
				}
				i++;
			}

			for (int j = 0; j < numSuc.length; j++) {
				System.out.println(numSuc[j] + 1);
			}
			System.out.println();

		}

	}
}

package prgrmm14.madrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 * @see https://www.aceptaelreto.com/problem/statement.php?id=191
 * @result TLE
 */
public class EProblemasRico {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++) {
			String[] input = br.readLine().split(" ");
			int comps = Integer.parseInt(input[0]);
			int cap = Integer.parseInt(input[1]);
			int dif = Integer.parseInt(input[2]);
			long suma = cap;
			while (comps > 1) {
				cap -= dif;
				suma += cap;
				comps--;
			}
			System.out.println(suma);
		}
	}
}

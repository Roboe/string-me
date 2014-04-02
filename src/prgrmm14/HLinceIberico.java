package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 * @see https://www.aceptaelreto.com/problem/statement.php?id=194
 * @result AC p1 t1.419 m3585
 */
public class HLinceIberico {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++) {
			char[] input = br.readLine().toCharArray();
			int vallas = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[j] == '.') {
					vallas++;
					j += 2;
				}
			}
			System.out.println(vallas);
		}
	}

}

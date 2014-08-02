package prgrmm14.madrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Roboe
 * @see https://www.aceptaelreto.com/problem/statement.php?id=189
 * @result MLE
 */
public class CTranslatlanticoBR {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pLength;
		while ((pLength = Integer.parseInt(br.readLine())) != 0) {
			int[] pasajeros = new int[pLength];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < pLength; i++) {
				pasajeros[i] = Integer.parseInt(st.nextToken());
			}
			int casos = Integer.parseInt(br.readLine());
			while (casos > 0) {
				String[] input = br.readLine().split(" ");
				if (input[0].equals("CONSULTA")) {
					System.out
							.println(pasajeros[Integer.parseInt(input[1]) - 1]);
				} else if (input[0].equals("EMBARQUE")) {
					int embarcar = Integer.parseInt(input[1]);
					int i = 0, j = 0;
					while (i < pLength) {
						if (pasajeros[i] != embarcar) {
							pasajeros[j] = pasajeros[i];
							j++;
						}
						i++;
					}
					pLength = j;
					System.out.println(pLength);
				}
				casos--;
			}
			System.out.println("*");
		}
	}
}
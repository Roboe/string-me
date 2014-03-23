package prgrmm14;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Roboe
 */
public class CTranslatlantico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pLength;
		while ((pLength = Integer.parseInt(sc.nextLine())) != 0) {
			int[] pasajeros = new int[pLength];
			StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
			for (int i = 0; i < pLength; i++) {
				pasajeros[i] = Integer.parseInt(st.nextToken());
			}
			int casos = Integer.parseInt(sc.nextLine());
			while (casos > 0) {
				String[] input = sc.nextLine().split(" ");
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
		sc.close();
	}
}

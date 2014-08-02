package prgrmm14.nacional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author usraux
 * @see https://www.aceptaelreto.com/problem/statement.php?id=213&cat=77
 * @result WA
 */
public class IAbonoTemporada {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while (!(linea = br.readLine()).equals("0 0 0")) {
			String[] nums = linea.split(" ");
			int diasT = Integer.parseInt(nums[0]);
			int longP = Integer.parseInt(nums[1]);
			int maxD = Integer.parseInt(nums[2]);
			int diasmax = 0;
			int auxT = diasT;

			while (auxT >= longP) {
				diasmax += maxD;
				auxT -= longP;
			}
			if (auxT > maxD) {
				diasmax += maxD;
			} else {
				diasmax += auxT;
			}
			System.out.println(diasmax);

		}

	}
}

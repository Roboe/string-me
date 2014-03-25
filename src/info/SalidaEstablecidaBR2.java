package info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 */
public class SalidaEstablecidaBR2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		do {
			input = br.readLine();
			if (!input.equals("0")) {
				System.out.println(input);
			}
		} while (!input.equals("0"));

		// System.out.println("Bye!");
	}

}
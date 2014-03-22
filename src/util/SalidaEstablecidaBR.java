package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Roboe
 */
public class SalidaEstablecidaBR {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while (!(input = br.readLine()).equals("0")) {
			System.out.println(input);
		}
		// System.out.println("Bye!");
	}

}

package acptalrto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.Entrada;

/**
 * @author Roboe
 * @link https://www.aceptaelreto.com/problem/statement.php?id=116
 * @result AC
 */
public class N116HolaMundoXDXDXD {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				Entrada.getEntrada(Entrada.ACPTALRTO, "N116")));
		int casos = Integer.parseInt(br.readLine());
		while (casos > 0) {
			System.out.println("Hola mundo.");
			casos--;
		}
	}
}

package prgrmm14.nacional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author usraux
 * @see https://www.aceptaelreto.com/problem/statement.php?id=205&cat=77
 * @result AC
 */
public class ANumeros {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++) {

			String num = br.readLine();
			int cont = 0;
			num = String.valueOf(llegarCaso(num));
			cont++;
			while (!compCapicua(num) && Integer.parseInt(num) < 1000000000) {
				num = String.valueOf(llegarCaso(num));
				cont++;
			}
			if (Integer.parseInt(num) > 1000000000) {
				System.out.println("Lychrel?");
			} else {
				System.out.println(cont + " " + num);
			}
		}
	}

	public static int llegarCaso(String num) {
		int resultado = Integer.parseInt(num) + darVuelta(num);
		return resultado;
	}

	public static int darVuelta(String num) {
		String nuevoNum = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			nuevoNum += num.charAt(i);
		}
		return Integer.parseInt(nuevoNum);
	}

	public static boolean compCapicua(String resultado) {
		for (int i = 0; i < (int) resultado.length() / 2; i++) {
			if (resultado.charAt(i) != resultado.charAt(resultado.length() - 1
					- i)) {
				return false;
			}
		}
		return true;

	}
}

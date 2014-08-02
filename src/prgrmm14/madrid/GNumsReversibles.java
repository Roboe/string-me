package prgrmm14.madrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Joslop
 * @see https://www.aceptaelreto.com/problem/statement.php?id=193
 * @result AC p1 t4.105 m3585
 */
public class GNumsReversibles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while (!(linea = br.readLine()).equals("0")) {
			if (mismoTamanno(linea, invierteNumero(linea))
					&& todoImpar(sumaNumeros(Integer.parseInt(linea),
							Integer.parseInt(invierteNumero(linea)))))
				System.out.print("SI\n");
			else
				System.out.print("NO\n");
		}
	}

	public static String invierteNumero(String linea) {
		StringBuilder invertida = new StringBuilder();
		for (int i = linea.length() - 1; i >= 0; i--) {
			invertida.append(linea.charAt(i));
		}
		return String.valueOf(Integer.parseInt(invertida.toString()));
	}

	public static String sumaNumeros(int num1, int num2) {
		return String.valueOf(num1 + num2);
	}

	public static boolean mismoTamanno(String num1, String num2) {
		if (num1.length() == num2.length())
			return true;
		return false;
	}

	public static boolean todoImpar(String resultado) {
		for (int i = 0; i < resultado.length(); i++) {
			if (Integer.parseInt(resultado.substring(i, i + 1)) % 2 == 0)
				return false;
		}
		return true;
	}
}

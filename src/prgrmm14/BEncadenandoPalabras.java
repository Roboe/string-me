package prgrmm14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.Entrada;

/**
 * @author Roboe
 */
public class BEncadenandoPalabras {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				Entrada.getEntrada(Entrada.PRGRMM14, "B")));
		String input;
		while ((input = br.readLine()) != null) {
			String[] palabra = input.split(" ");
			boolean valido = true;
			for (int i = 0; i < palabra.length && valido; i++) {
				if (i != 0) {
					/*
					 * System.out.println(palabra[i - 1].substring(palabra[i -
					 * 1] .length() - 2) + " " + palabra[i].substring(0, 2));
					 */
					valido = palabra[i - 1].substring(
							palabra[i - 1].length() - 2).equals(
							palabra[i].substring(0, 2));
				}
			}
			System.out.println((valido) ? "SI" : "NO");
		}
	}
}

package util;

import java.util.Scanner;

/**
 * @author Roboe 
 */
public class CasosContados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < casos; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}

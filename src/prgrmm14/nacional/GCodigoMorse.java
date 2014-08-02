package prgrmm14.nacional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author usraux
 * @see https://www.aceptaelreto.com/problem/statement.php?id=211&cat=77
 * @result AC
 */
public class GCodigoMorse {

    public static void main(String[] args) throws IOException {
        String morse[] = {".o", "o...", "o.o.", "o..", ".", "..o.", "oo.", "....", "..", ".ooo", "o.o", ".o..", "oo", "o.", "ooo", ".oo.", "oo.o", ".o.", "...", "o", "..o", "...o", ".oo", "o..o", "o.oo", "oo.."};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input, real, reduc;
        while ((real = br.readLine()) != null) {
            reduc = "";
            input = real.toLowerCase();
            for (char a : input.toCharArray()) {
                //reduc
                if (a == 'a' || a == 'i' || a == 'e' || a == 'u') {
                    reduc = reduc + ".";
                } else if (a == 'o') {
                    reduc = reduc + "o";
                }
            }
            if (reduc.compareTo(morse[input.charAt(0) - 'a']) == 0) {
                System.out.println(real + " OK");
            } else {
                System.out.println(real + " X");
            }

        }

    }
}


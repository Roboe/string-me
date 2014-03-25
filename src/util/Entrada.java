package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author Roboe
 */
public final class Entrada {
	private Entrada() {
		// No hay static class en Java... esto servirá, ;)
	}

	public static final String PRGRMM14 = "prgrmm14";
	public static final String ACPTALRTO = "acptalrto";

	/**
	 * Proporciona un InputStream con el archivo de texto de la entrada de
	 * ejemplo del problema.
	 * 
	 * @param paquete
	 *            Nombre del paquete donde se encuentra el problema
	 * @param localizador
	 *            Letra o número identificativos (Ejemplo: "A", "F", "N102",
	 *            "N138")
	 * @return InputStream del archivo
	 * @throws FileNotFoundException
	 *             En el caso de no existir el archivo
	 */
	public static final InputStream getEntrada(String paquete,
			String localizador) throws FileNotFoundException {
		InputStream fis = new FileInputStream(new File("src/" + paquete
				+ "/io/" + localizador + ".in"));
		return fis;
	}
}

package info;

/**
 * @author Roboe
 */
public class NumerosYTipos {
	/**
	 * http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.err.printf("%10s\t%10s\t%10s\t%10s\t%s\t\n", "TIPO", "MÍNIMO",
				"DEFECTO", "MÁXIMO", "EXTRA");
		print("byte", "-128", "0", "127", "8-bit con signo.");
		// byte byt = 0b1111111;
		// System.out.println(byt);
		print("short", "-32,768", "0", "32,767", "16-bit con signo.");
		print("int", "-2^31", "0", "2^31 - 1", "32-bit con signo.");
		print("long", "-2^63", "0L", "2^63 - 1", "64-bit con signo.");
		print("float",
				"-",
				"0.0f",
				"-",
				"32-bit IEEE 754 floating point. This data type should never be used for precise values, such as currency.");
		print("double",
				"-",
				"0.0d",
				"-",
				"64-bit IEEE 754 floating point. This data type should never be used for precise values, such as currency.");
		print("boolean",
				"false",
				"false",
				"true",
				"Represents one bit of information, but its \"size\" isn't something that's precisely defined.");
		print("char", "'\u0000'", "'\u0000'", "'\uffff'",
				"16-bit Unicode character");
		print("(char)", "(0)", "(0)", "(65,535)", "");
	}

	public static final void print(String tipo, String minimo, String defecto,
			String maximo, String extra) {
		System.out.printf("%10s\t%10s\t%10s\t%10s\t%s\t\n", tipo, minimo,
				defecto, maximo, extra);
		/*
		 * System.out.println(tipo + "\t" + minimo + "\t" + maximo + (extra !=
		 * null ? ("\t" + extra) : ""));
		 */
	}

}

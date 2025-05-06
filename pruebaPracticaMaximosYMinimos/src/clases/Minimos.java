package clases;

/**
 * @author Adrián
 */

public class Minimos {
	/**
	 * Calcular el valor minimo de dos números enteros positivos pasados por parametros
	 * @param num1
	 * @param num2
	 * @return el valor minimo de dos números enteros positivos (mayores o iguales que 0)
	 */
	public static int MinimoDe2EnterosPositivos (int num1, int num2) {
		if (num1>=0 && num2>=0) {
			if (num1<num2) {
				return num1;
			}else if (num1==num2) {
				return num1;
			}else {
				return num2;
			}
		}else {
			return 0;
		}
	}
	
	/**
	 * Calcular el valor minimo de 3 números enteros positivos
	 * @param num1
	 * @param num2
	 * @return el valor minimo de 3 números enteros positivos (mayores o iguales que 0)
	 */
	public static int MinimoDe3EnterosPositivos (int num1, int num2, int num3) {
		if (num1>=0 && num2>=0 && num2>=0) {
			if (num1<num2 && num1<num3) {
				return num1;
			}if (num2<num1 && num2<num3) {
				return num2;
			}else {
				return num3;
			}
		}else {
			return 0;
		}
	}

}

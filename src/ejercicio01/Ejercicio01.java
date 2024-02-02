package ejercicio01;

/**
 * Clase donde rellenamos una tabla bidimensional con numeros
 * 
 * @author earnesto
 */
public class Ejercicio01 {

	/**
	 * Main donde realizamos las instrucciones
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Array bidimensional
		int num[][] = new int[3][6];

		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Bucle que recorre la tabla fila por fila con el primer for y por columnas con
		// el segundo for, imprimiendo la celda correspondiente
		for (int[] fila : num) {
			for (int numero : fila) {
				System.out.print(numero + "\t");
			}
			System.out.println();
		}
	}

}

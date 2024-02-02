package ejercicio09;

import java.util.Random;

public class Ejercicio09 {

	public static boolean matrizMagica (int tabla[][]) {
		boolean magica=true;
		int suma=0;
		int suma2;
		
		for (int valor : tabla[0]) {
			suma+=valor;
		}
		
		//Compruebo las filas
		while (magica) {
		for (int fila[] : tabla) {
			suma2=0;
			for (int valor : fila) {
				suma2+=valor;
			}
			if (suma2!=suma) {
				magica=false;
			}
		}
	}
		
		return magica;
	}
	
	public static void main(String[] args) {
		// Arrays bidimensional
		int tabla[][] = new int[5][5];

		// Booleano para saber si la tabla es simétrica
		boolean simetria;

		// Random para generar posiciones aleatorias
		Random rand = new Random();

		// Relleno la tabla con numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0, 1001);
			}
		}

	}

}

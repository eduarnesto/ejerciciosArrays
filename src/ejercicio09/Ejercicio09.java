package ejercicio09;

import java.util.Random;

public class Ejercicio09 {

	static boolean matrizMagica(int tabla[][]) {
		boolean magica = true;
		int suma1=0;
		int suma2=0;
		int contador = 1;
		
		for(int j=0; j< tabla[0].length; j++) {
			suma1 += tabla[0][j];
		}
		
		while(contador<tabla.length && magica) {
			suma2 = 0;
			for(int j=0; j<tabla[contador].length; j++) {
				suma2 += tabla[contador][j];
			}
			if(suma2 != suma1) {
				magica = false;				
			}
			contador++;
		}
		
		if(magica) {
			contador = 0;
			while(contador<tabla.length && magica) {
				suma2 = 0;
				for(int j=0; j<tabla[contador].length; j++) {
					suma2 += tabla[j][contador];
				}
				if(suma2 != suma1) {
					magica = false;				
				}
				contador++;
			}
		}
		
		return magica;
	}
	
	public static void main(String[] args) {
		// Arrays bidimensional
		int tabla[][] = new int[5][5];

		// Booleano para saber si la tabla es simétrica
		boolean magica;

		// Random para generar posiciones aleatorias
		Random rand = new Random();

		// Relleno la tabla con numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0, 1001);
			}
		}
		
		//Llamo a la funcion
		magica = matrizMagica(tabla);
		
		//Muestro si la tabla es mágica
		System.out.println("¿Es la matriz mágica? " + magica);

	}

}

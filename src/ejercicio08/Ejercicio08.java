package ejercicio08;

import java.util.Random;

public class Ejercicio08 {
	
	public static boolean simetria(int tabla[][]) {
		int filas=0;
		int columnas=0;
		boolean simetria=true;
		while (filas<tabla.length && simetria) {
			while (columnas<tabla[filas].length && simetria) {
				if (tabla[filas][columnas] != tabla[columnas][filas]) {
					simetria=false;
				}
				columnas++;
			}
			filas++;
		}
		return simetria;
	}

	public static void main(String[] args) {
		//Arrays bidimensional
		int tabla[][] = new int [5][5]; 
		
		//Booleano para saber si la tabla es simétrica
		boolean simetria;
		
		//Random para generar posiciones aleatorias
		Random rand = new Random ();
		
		
		//Relleno la tabla con numeros aleatorios
		for (int i=0;i<tabla.length;i++) {
			for (int j=0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0,1001);
			}
		}
		
		//Llamo a la funcion que me genera la tabla transpuesta
		simetria = simetria(tabla);
		
		//Muestro si la tabla es simetrica
		System.out.println("¿Es la tabla simétrica? " + simetria);

	}

}

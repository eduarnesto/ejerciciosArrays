package ejercicio07;

import java.util.Random;

public class Ejercicio07 {

	public static void transpocion (int tabla[][], int tabla2[][]) {
		for (int i=0;i<tabla.length;i++) {
			for (int j=0; j < tabla[i].length; j++) {
				tabla2[j][i] = tabla[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		//Arrays bidimensional
		int tabla[][] = new int [4][5]; 
		
		//Array bidimensional transpuesta
		int tabla2[][] = new int [tabla[0].length][tabla.length];
		
		//Random para generar posiciones aleatorias
		Random rand = new Random ();
		
		//Relleno la tabla con numeros aleatorios
		for (int i=0;i<tabla.length;i++) {
			for (int j=0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0,1001);
			}
		}
		
		//Llamo a la funcion que me genera la tabla transpuesta
		transpocion(tabla, tabla2);
		
		//Muestro las tablas
		for (int i=0;i<tabla.length;i++) {
			for (int j=0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<tabla2.length;i++) {
			for (int j=0; j < tabla2[i].length; j++) {
				System.out.print(tabla2[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

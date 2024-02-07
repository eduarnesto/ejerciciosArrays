package ejercicio10;

import java.util.Random;

public class Ejercicio10 {

	public static int[][] gira90(int tablaInicio[][]){
		int tablaGirada[][] = new int [tablaInicio.length][tablaInicio.length];
		
		for (int i=0;i<tablaInicio.length;i++) {
			for (int j=0;j<tablaInicio[i].length;j++) {
				tablaGirada[j][tablaInicio.length-1-i]=tablaInicio[i][j];
			}
		}
		
		return tablaGirada;
	}
	
	public static void main(String[] args) {
		// Arrays bidimensional
		int tabla[][] = new int[3][3];
		
		//Array ya girado
		int tablaGirada[][] = new int [tabla.length][tabla.length];

		// Random para generar posiciones aleatorias
		Random rand = new Random();

		// Relleno la tabla con numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0, 10);
			}
		}
		
		//Llamo a la función
		tablaGirada = gira90(tabla);
		
		//Muestro las dos tablas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 0; i < tablaGirada.length; i++) {
			for (int j = 0; j < tablaGirada[i].length; j++) {
				System.out.print(tablaGirada[i][j]);
			}
			System.out.println();
		}
	}

}

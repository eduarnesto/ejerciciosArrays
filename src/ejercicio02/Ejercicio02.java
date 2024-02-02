package ejercicio02;

import java.util.Scanner;

/**
 * Clase donde 
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// Array bidimensional
		int clase[][] = new int[4][5];

		// Variable para la media
		double media;

		// Variable para el maximo
		int max;

		// Variable para el minimo
		int min;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pregunto por las notas de cada alumno
		for (int fila = 0; fila < clase.length; fila++) {
			for (int columna = 0; columna < clase[fila].length; columna++) {
				System.out.println("Introduzca la nota " + (columna + 1) + "º del alumno " + (fila + 1));
				clase[fila][columna] = sc.nextInt();
			}
		}
		
		// Syso para leerlo mas claro
		System.out.println();

		// Imprimo las notas
		for (int fila = 0; fila < clase.length; fila++) {
			System.out.print("Alumno " + (fila + 1) + "\t");
			for (int columna = 0; columna < clase[fila].length; columna++) {
				System.out.print(clase[fila][columna] + "\t");
			}
			System.out.println();
		}

		// Syso para leerlo mas claro
		System.out.println();

		// Muestro la media, el maximo y el minimo de cada alumno
		for (int fila = 0; fila < clase.length; fila++) {
			max = clase[fila][0];
			min = clase[fila][0];
			media = 0;
			for (int columna = 0; columna < clase[fila].length; columna++) {
				if (clase[fila][columna] < min) {
					min = clase[fila][columna];
				}
				if (clase[fila][columna] > max) {
					max = clase[fila][columna];
				}
				media += clase[fila][columna];
			}
			media = media / clase[fila].length;
			System.out.println("La nota minima del alumno " + (fila + 1) + " es " + min + ", la maxima " + max
					+ " y la media " + media);
		}

		// Cierro el Scanner
		sc.close();
	}

}

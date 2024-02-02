package ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	private static final int COLUMNAS = 5;

	private static final int FILAS = 4;

	// Scanner para leer del teclado
	Scanner sc = new Scanner(System.in);

	// Random para generar numeros aleatorios
	static Random rand = new Random();

	public static void main(String[] args) {
		// Tabla para guardar los numeros
		int tabla[][] = new int[FILAS][COLUMNAS];

		// Llamo a la funcion para rellenar la tabla
		rellenaTabla(tabla);

		// Llamo a la funcion para hacer las sumas
		sumaTabla(tabla);
	}

	public static void rellenaTabla(int tabla[][]) {
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				tabla[fila][columna] = rand.nextInt(100, 1000);
			}
		}
	}

	public static void sumaTabla(int tabla[][]) {
		int suma;
		int sumaColumn[] = new int[tabla[0].length + 1];

		for (int fila = 0; fila < tabla.length; fila++) {
			suma = 0;

			for (int columna = 0; columna < tabla[fila].length; columna++) {
				suma += tabla[fila][columna];
				sumaColumn[columna] += tabla[fila][columna];
				System.out.print(tabla[fila][columna] + "\t");
			}

			sumaColumn[sumaColumn.length - 1] += suma;
			System.out.println(suma + "\t");
		}

		for (int i = 0; i < sumaColumn.length; i++) {
			System.out.print(sumaColumn[i] + "\t");
		}
	}

}

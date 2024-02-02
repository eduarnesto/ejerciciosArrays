package ejercicio06;

import java.util.Random;

public class Ejercicio06 {

	
	public static int[] minMax (int tabla[][]) {
		int min = tabla[0][0];
		int max = tabla[0][0];
		int tablaMinMax[] = new int [2];
		
		for (int fila[] : tabla) {
			for (int valor : fila) {
				if (valor<min) {
					min=valor;
				}
				if (valor>max) {
					max=valor;
				}
			}
		}
		
		tablaMinMax[0]=min;
		tablaMinMax[1]=max;
		
		return tablaMinMax;
	}
	
	public static void main(String[] args) {
		//Arrays bidimensional
		int tabla[][] = new int [5][5]; 
		
		//Array para saber cual es el minmo y el maximo
		int tablaMinMax[] = new int [2];
		
		//Random para generar posiciones aleatorias
		Random rand = new Random ();
		
		//Relleno la tabla con numeros aleatorios
		for (int i=0;i<tabla.length;i++) {
			for (int j=0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(0,1001);
			}
		}
		
		//Llamo a la funcion para saber cual es el maximo y cual el minimo
		minMax(tabla);
		
		//Muestro el resultado
		System.out.println("El mínimo de la tabla es " + tablaMinMax[0]);
		System.out.println("El máximo de la tabla es " + tablaMinMax[1]);

	}

}

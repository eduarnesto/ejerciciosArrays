package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Array bidimensional
		int tabla[][] = new int [10][10];
		
		//Llamo a la funcion 
		tablasMultiplicar(tabla);
		
		//Imprimo la tabla
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				System.out.print(tabla[fila][columna] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void tablasMultiplicar (int tabla[][]) {
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				tabla[fila][columna]=(fila+1)*(columna+1);
			}
		}
	}

}

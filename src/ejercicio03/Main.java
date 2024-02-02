package ejercicio03;

public class Main {

	public static void main(String[] args) {
		//Array bidimensional
		int tabla[][] = new int [7][7];
		
		//Llamo a la funcion 
		rellenaTabla(tabla);
		
		//Imprimo la tabla
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				System.out.print(tabla[fila][columna] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void rellenaTabla (int tabla[][]) {
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				tabla[fila][columna]=10*(fila+columna);
			}
		}
	}

}

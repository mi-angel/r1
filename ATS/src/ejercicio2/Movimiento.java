package ejercicio2;

import java.util.Scanner;

import classAndMethods.Main;

/*
 * Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero
 * y actualice su posici�n dentro del mismo. Los movimientos posibles son arriba, abajo, izquierda y derecha.
 * Tras cada movimiento el programa mostrar� la nueva direcci�n elegida y las coordenadas de situaci�n del objeto dentro del tablero. 
 */

public class Movimiento {


	Scanner d = new Scanner(System.in);
	private static int nFilas, nCol, posFila=0, posCol=0;
	private static char a[][], des;

	//M�todo para dar la vienvenida
	public static void bienvenida() {
	System.out.println("�Bienvenido(a)!");
	}
	
	//M�todo para dar instrucciones
	public void instrucciones() {
		System.out.println("\nVamos a desplazar la letra M dentro del tablero.\n");
	}
	
		
	//M�todo para elegir el tama�o del tablero y crearlo
	public void tama�oTablero() {
		System.out.print("Por favor, indique el n�mero de filas del tablero: ");
		nFilas=d.nextInt();
		System.out.print("Por favor, indique el n�mero de columnas del tablero: ");
		nCol=d.nextInt();
		
		a=new char[nFilas][nCol];
	}

	//M�todo para imprimir el tablero con la posici�n del objeto
	public void muestraTablero() {
		if(posFila<=nFilas-1 && posFila>=0 && posCol<=nCol-1 && posCol>=0) {
			for(int i=0;i<nFilas;i++) {
				for(int j=0;j<nCol;j++) {
					a[i][j]='*';
					if(i==posFila & j==posCol) {
						a[i][j]='M';
					}
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
		}
	}

	public void generaMovimientos() {
		do {
			System.out.println("\nPara generar el desplazamiento presione alguna de las siguitentes teclas:\n"
				+ "Arriba: e\n"
				+ "Abajo: d\n"
				+ "Izquierda: s\n"
				+ "Derecha: f\n"
				+ "Salir del juego XD: x.");
		
			des = d.next().charAt(0);
					
					if(des=='e') {
						posFila-=1;
					}
					else if(des=='d') {
						posFila+=1;
					}
					else if(des=='s') {
						posCol-=1;
					}
					else if(des=='f') {
						posCol+=1;
					}
					
					if(posFila>nFilas-1) {
						System.out.println("Ha llegado a la orilla del tablero, por favor dirij�se en otra direcci�n.");
						posFila-=1;
					}
					else if(posFila<0) {
						System.out.println("Ha llegado a la orilla del tablero, por favor dirij�se en otra direcci�n.");
						posFila+=1;
					}
					else if(posCol>nCol-1) {
						System.out.println("Ha llegado a la orilla del tablero, por favor dirij�se en otra direcci�n.");
						posCol-=1;
					}
					else if(posCol<0) {
						System.out.println("Ha llegado a la orilla del tablero, por favor dirij�se en otra direcci�n.");
						posCol+=1;
					}
					
					muestraTablero();
					
		}while(des!='x');
	
	System.out.println("�Gracias por participar! =)");
	}
	
	
}

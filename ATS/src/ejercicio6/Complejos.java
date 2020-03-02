package ejercicio6;

import java.util.Scanner;

/*
	 * Construir un programa para trabajar con 2 numeros 
	 * complejos, implemente el sigueinte men�:
	 * 1.- sumar dos n�meros complejos
	 * 2.- Multiplicar dos n�meros complejos
	 * 3.- Comparar dos n�meros complejos (iguales o no)
	 * 4.- Multiplicar un n�mero complejo por un entero
	 */
public class Complejos {
	Scanner n = new Scanner(System.in);
	int op, r1, r2, r3, r4, sumaR, sumaI, multR, multI, multR2, multI2, entero;
	char signo;
	public void bienvenida() {
		System.out.print("�Bienvenido(a)!\n"
				+ "Los n�meros complejos son pares de n�meros,\n"
				+ "el primer elemento est� formado por los n�meros reales\n"
				+ "y el segundo elemento por n�meros imaginarios.\n\n"
				+ "Cuando el elemento de los n�meros reales es igual a cero\n"
				+ "se dice que se tiene un n�mero imaginario puro.\n\n"
				+ "Cuando el elemento de los n�meros imaginarios es igual \n"
				+ "a cero se dice que se tiene un n�mero real.\n\n"
				+ "En este programa vamos a trabajar con n�meros complejos.\n");
	}
	
	public int desplegaMenu() {
		do {
		System.out.print("\nPor favor, ingrese el n�mero de la opci�n que \n"
						+ "corresponda a la acci�n que desee ejecutar: \n"
						+ "\n1) Sumar dos n�meros complejos."
						+ "\n2) Multiplicar dos n�meros complejos."
						+ "\n3) Comparar dos n�meros complejos."
						+ "\n4) Multiplicar un n�mero complejo por un n�mero entero.\n"
						+ "\nOpci�n n�mero: ");
		op = n.nextInt();
		}while(op<1 | op>4);
		return op;
	}
	
	public int sumaReales() {
		sumaR=r1 + r3;
		return sumaR;
	}
	
	public int sumaImaginarios() {
		sumaI=r2+r4;
		return sumaI;
	}
	
	public void resultadoSuma() {
		System.out.print("La suma de "+r1+" + "+r2+"i y "+r3+" + "+r4+"i es: "+sumaReales()+" + "+sumaImaginarios()+"i.");
	}
	
	public int multReales1() {
		multR=r1*r3;
		return multR;
	}
	
	public int multReales2() {
		multR2= r2*r4;
		return multR2;
	}
	
	public int multImaginarios1() {
		multI = r1*r4;
		return multI;
	}
	
	public int multImaginarios2() {
		multI2=r2*r3;
		return multI2;
	}
	
	public void resultadoMult() {
		int productoComplejo1 = (multReales1() + (-1*multReales2()));
		int productoComplejo2 = ((multImaginarios1())+(multImaginarios2()));
		System.out.print("El producto de "+r1+" + "+r2+"i y "+r3+" + "+r4+"i es: "+productoComplejo1+" + "+productoComplejo2+"i");
	}
	
	public String comparaComplejos() {
		int real, imaginario;
		if(r1>r3) {
			real=r1;
			System.out.println("La parte real del n�mero "+r1+" + "+r2+"i es m�s grande que la parte real del n�mero "+r3+" + "+r4+"i");
		}else {
			real=r3;
			System.out.println("La parte real del n�mero "+r3+" + "+r4+"i es m�s grande que la parte real del n�mero "+r1+" + "+r2+"i");
		}
		if(r2>r4) {
			imaginario=r2;
			System.out.println("La parte imaginaria del n�mero "+r1+" + "+r2+"i es m�s grande que la parte imaginaria del n�mero "+r3+" + "+r4+"i");
		}else {
			imaginario=r4;
			System.out.println("La parte imaginaria del n�mero "+r3+" + "+r4+"i es m�s grande que la parte imaginaria del n�mero "+r1+" + "+r2+"i");
		}
		
		String retorno="El n�mero complejo m�s grande entre "+r1+" + "+r2+"i y "+r3+" + "+r4+"i es: "+real+" + "+imaginario+"i. (Lo que puede ser una combinaci�n de la parte real y la parte imaginaria de los n�meros complejos ingresados XD )\n\n"
				+ "Nota:\n"
				+ "La comparaci�n realizada es una expresi�n sencilla que atiende a una relaci�n de orden conocida y aplicada principalmente al conjunto de los n�meros reales, una comparaci�n m�s precisa de los n�meros complejos implica la representaci�n de los puntos en el plano complejo y la asignaci�n de un criterio de orden, por ejemplo: la cercan�a o lejan�a con respecto al origen.";
		return retorno;
	}
	
	public void realMultComplejo() {
		int real, imaginario;
		real=entero*r1;
		imaginario=entero*r2;
		
		System.out.print("El resultado de multiplicar "+entero+" por "+r1+" + "+r2+"i es: "+real+" + "+imaginario+"i.");
	}
	
	public void ingresaComplejo() {
		char respuesta;
		do {
			System.out.print("\nPor favor, ingrese el elemento (n�mero) real del n�mero complejo: ");
			r1 = n.nextInt();		
			System.out.print("\nPor favor, ingrese el coeficiente de i: ");
			r2 = n.nextInt();
			
			do {
				System.out.print("\nEl n�mero ingresado es: "+r1+" + "+r2+"i\n"
						+ "�Es correcto? Y/N: ");
				respuesta=n.next().charAt(0);
				
			}while(respuesta !='y' & respuesta !='Y' & respuesta !='n' & respuesta !='N');
		
		}while(respuesta == 'n' | respuesta == 'N');

		if(respuesta=='y' | respuesta=='Y') {
			do {
				System.out.println("\n�Gracias! Ahora indique los valores del siguiente n�mero complejo.");
				System.out.print("\nPor favor, ingrese el elemento (n�mero) real del n�mero complejo: ");
				r3 = n.nextInt();		
				System.out.print("\nPor favor, ingrese el coeficiente de i: ");
				r4 = n.nextInt();
				do {
					System.out.println("\nEl n�mero ingresado es: "+r3+" + "+r4+"i\n"
							+ "�Es correcto? Y/N: ");
					respuesta=n.next().charAt(0);
					}while(respuesta != 'y' & respuesta != 'Y' & respuesta != 'n' & respuesta != 'N');
			}while(respuesta == 'n' | respuesta == 'N');
		}
	}
	
	public void ingresaComplejoYReal() {
		char respuesta;
		do {
			System.out.print("\nPor favor, ingrese el elemento (n�mero) real del n�mero complejo: ");
			r1 = n.nextInt();		
			System.out.print("\nPor favor, ingrese el coeficiente de i: ");
			r2 = n.nextInt();
			
			do {
				System.out.println("\nEl n�mero ingresado es: "+r1+" + "+r2+"i\n"
						+ "�Es correcto? Y/N: ");
				respuesta=n.next().charAt(0);
			}while(respuesta != 'y' & respuesta != 'Y' & respuesta != 'n' & respuesta != 'N');
		
		}while(respuesta == 'n' | respuesta == 'N');
		
		System.out.print("\nAhora por favor, ingrese el n�mero entero");
		entero=n.nextInt();
	}
	
}

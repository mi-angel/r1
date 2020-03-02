package ejercicio6;

import java.util.Scanner;

/*
	 * Construir un programa para trabajar con 2 numeros 
	 * complejos, implemente el sigueinte menú:
	 * 1.- sumar dos números complejos
	 * 2.- Multiplicar dos números complejos
	 * 3.- Comparar dos números complejos (iguales o no)
	 * 4.- Multiplicar un número complejo por un entero
	 */
public class Complejos {
	Scanner n = new Scanner(System.in);
	int op, r1, r2, r3, r4, sumaR, sumaI, multR, multI, multR2, multI2, entero;
	char signo;
	public void bienvenida() {
		System.out.print("¡Bienvenido(a)!\n"
				+ "Los números complejos son pares de números,\n"
				+ "el primer elemento está formado por los números reales\n"
				+ "y el segundo elemento por números imaginarios.\n\n"
				+ "Cuando el elemento de los números reales es igual a cero\n"
				+ "se dice que se tiene un número imaginario puro.\n\n"
				+ "Cuando el elemento de los números imaginarios es igual \n"
				+ "a cero se dice que se tiene un número real.\n\n"
				+ "En este programa vamos a trabajar con números complejos.\n");
	}
	
	public int desplegaMenu() {
		do {
		System.out.print("\nPor favor, ingrese el número de la opción que \n"
						+ "corresponda a la acción que desee ejecutar: \n"
						+ "\n1) Sumar dos números complejos."
						+ "\n2) Multiplicar dos números complejos."
						+ "\n3) Comparar dos números complejos."
						+ "\n4) Multiplicar un número complejo por un número entero.\n"
						+ "\nOpción número: ");
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
			System.out.println("La parte real del número "+r1+" + "+r2+"i es más grande que la parte real del número "+r3+" + "+r4+"i");
		}else {
			real=r3;
			System.out.println("La parte real del número "+r3+" + "+r4+"i es más grande que la parte real del número "+r1+" + "+r2+"i");
		}
		if(r2>r4) {
			imaginario=r2;
			System.out.println("La parte imaginaria del número "+r1+" + "+r2+"i es más grande que la parte imaginaria del número "+r3+" + "+r4+"i");
		}else {
			imaginario=r4;
			System.out.println("La parte imaginaria del número "+r3+" + "+r4+"i es más grande que la parte imaginaria del número "+r1+" + "+r2+"i");
		}
		
		String retorno="El número complejo más grande entre "+r1+" + "+r2+"i y "+r3+" + "+r4+"i es: "+real+" + "+imaginario+"i. (Lo que puede ser una combinación de la parte real y la parte imaginaria de los números complejos ingresados XD )\n\n"
				+ "Nota:\n"
				+ "La comparación realizada es una expresión sencilla que atiende a una relación de orden conocida y aplicada principalmente al conjunto de los números reales, una comparación más precisa de los números complejos implica la representación de los puntos en el plano complejo y la asignación de un criterio de orden, por ejemplo: la cercanía o lejanía con respecto al origen.";
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
			System.out.print("\nPor favor, ingrese el elemento (número) real del número complejo: ");
			r1 = n.nextInt();		
			System.out.print("\nPor favor, ingrese el coeficiente de i: ");
			r2 = n.nextInt();
			
			do {
				System.out.print("\nEl número ingresado es: "+r1+" + "+r2+"i\n"
						+ "¿Es correcto? Y/N: ");
				respuesta=n.next().charAt(0);
				
			}while(respuesta !='y' & respuesta !='Y' & respuesta !='n' & respuesta !='N');
		
		}while(respuesta == 'n' | respuesta == 'N');

		if(respuesta=='y' | respuesta=='Y') {
			do {
				System.out.println("\n¡Gracias! Ahora indique los valores del siguiente número complejo.");
				System.out.print("\nPor favor, ingrese el elemento (número) real del número complejo: ");
				r3 = n.nextInt();		
				System.out.print("\nPor favor, ingrese el coeficiente de i: ");
				r4 = n.nextInt();
				do {
					System.out.println("\nEl número ingresado es: "+r3+" + "+r4+"i\n"
							+ "¿Es correcto? Y/N: ");
					respuesta=n.next().charAt(0);
					}while(respuesta != 'y' & respuesta != 'Y' & respuesta != 'n' & respuesta != 'N');
			}while(respuesta == 'n' | respuesta == 'N');
		}
	}
	
	public void ingresaComplejoYReal() {
		char respuesta;
		do {
			System.out.print("\nPor favor, ingrese el elemento (número) real del número complejo: ");
			r1 = n.nextInt();		
			System.out.print("\nPor favor, ingrese el coeficiente de i: ");
			r2 = n.nextInt();
			
			do {
				System.out.println("\nEl número ingresado es: "+r1+" + "+r2+"i\n"
						+ "¿Es correcto? Y/N: ");
				respuesta=n.next().charAt(0);
			}while(respuesta != 'y' & respuesta != 'Y' & respuesta != 'n' & respuesta != 'N');
		
		}while(respuesta == 'n' | respuesta == 'N');
		
		System.out.print("\nAhora por favor, ingrese el número entero");
		entero=n.nextInt();
	}
	
}

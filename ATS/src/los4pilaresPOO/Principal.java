package los4pilaresPOO;

import java.util.Scanner;
import java.util.ArrayList;


public class Principal {
	static Scanner n = new Scanner(System.in);
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
	
	public static void main(String[] args) {
		//M�todo para llenar de tri�ngulos y rect�ngulos
		llenarPoligono();
		mostrarResultados();
	}
	
	public static void llenarPoligono() {
		int opci�n;
		char otro;
		System.out.println("�Bienvenido(a)!\n"
				+ "En este programa trabajaremos con pol�gonos para calcular sus �reas.\n");
		do {
			do {System.out.print("\nPor favor digite la opci�n que corresponda,\n"
									+ "de acuerdo a la informaci�n del pol�gono que\n"
									+ "desee ingresar:\n\n"
									+ "1.-Rect�ngulo\n"
									+ "2.-Tri�ngulo\n\n"
									+ "Opci�n: ");
				opci�n = n.nextInt();
			}while(opci�n<1 || opci�n>2);
			
			switch(opci�n) {
			case 1: llenarRectangulo(); //llenar rect�ngulo
				break;
			case 2: llenarTriangulo(); //llenar tri�ngulo
				break;
			}
			
			System.out.print("\n�Desea ingresar otro pol�gono? s/n: ");
			otro=n.next().charAt(0);
		}while(otro=='s'||otro=='S');		
	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		
		System.out.print("\nPor favor, digite los siguientes valores.\n"
						+ "Lado 1: ");
		lado1=n.nextDouble();
		System.out.print("Lado 2: ");
		lado2=n.nextDouble();
		System.out.print("Lado 3: ");
		lado3=n.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		poligonos.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1, lado2;
		
		System.out.print("\nPor favor, digite los siguientes valores.\n"
				+ "Lado 1: ");
		lado1=n.nextDouble();
		System.out.print("Lado 2: ");
		lado2=n.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		
		poligonos.add(rectangulo);
	}
	
	public static void mostrarResultados() {
		for(Poligono poli:poligonos) {
			//El m�todo toString retorna una cadena, luego, es necesario imprimirla para poder verla
			System.out.println(poli.toString());
			//Tanto el m�todo toString() como el m�todo area() son m�todos que estan sobre-escritos. Conforme se recorre el ArrayList cada objeto llamar� a los m�todos correspondientes.  
			System.out.println("�rea: "+poli.area());
		}
	}
}

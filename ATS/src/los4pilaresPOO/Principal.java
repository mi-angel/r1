package los4pilaresPOO;

import java.util.Scanner;
import java.util.ArrayList;


public class Principal {
	static Scanner n = new Scanner(System.in);
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
	
	public static void main(String[] args) {
		//Método para llenar de triángulos y rectángulos
		llenarPoligono();
		mostrarResultados();
	}
	
	public static void llenarPoligono() {
		int opción;
		char otro;
		System.out.println("¡Bienvenido(a)!\n"
				+ "En este programa trabajaremos con polígonos para calcular sus áreas.\n");
		do {
			do {System.out.print("\nPor favor digite la opción que corresponda,\n"
									+ "de acuerdo a la información del polígono que\n"
									+ "desee ingresar:\n\n"
									+ "1.-Rectángulo\n"
									+ "2.-Triángulo\n\n"
									+ "Opción: ");
				opción = n.nextInt();
			}while(opción<1 || opción>2);
			
			switch(opción) {
			case 1: llenarRectangulo(); //llenar rectángulo
				break;
			case 2: llenarTriangulo(); //llenar triángulo
				break;
			}
			
			System.out.print("\n¿Desea ingresar otro polígono? s/n: ");
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
			//El método toString retorna una cadena, luego, es necesario imprimirla para poder verla
			System.out.println(poli.toString());
			//Tanto el método toString() como el método area() son métodos que estan sobre-escritos. Conforme se recorre el ArrayList cada objeto llamará a los métodos correspondientes.  
			System.out.println("Área: "+poli.area());
		}
	}
}

package ejercicio5;

import java.util.Scanner;

import ejercicio2.Movimiento;

public class TrianguloPrincipal {
	
	public static double areaMayor(TriangulosIsosceles t[]) {
		double areaMayor;
		areaMayor=t[0].getArea();
		for(int i=1; i<t.length;i++) {
			if(areaMayor<t[i].getArea()) {
				areaMayor=t[i].getArea();
			}
		}
		return areaMayor;
	}
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double base, lado, areaMayor;
		int nTriangulos;
		
		
		Movimiento.bienvenida();
		System.out.print("Por favor, indique el número de triángulos: ");
		nTriangulos=n.nextInt();
		
		TriangulosIsosceles t[]=new TriangulosIsosceles[nTriangulos];
		
		for(int i=0;i<t.length;i++) {
			System.out.print("\n\nPor favor, digite la medida de la base del triángulo "+(i+1)+": ");
			base=n.nextDouble();
			System.out.print("\nPor favor, digite la medida de un de los lados iguales del triángulo "+(i+1)+": ");
			lado=n.nextDouble();
			
			t[i]= new TriangulosIsosceles(base, lado);
			
			System.out.print("\nEl área del triángulo es: "+t[i].getArea());
			System.out.print("\nEl perímetro del triángulo es: "+t[i].getPerimetro());
		}
		areaMayor=TrianguloPrincipal.areaMayor(t);
		System.out.println("\nEl area de los triángulos, más grande es: "+areaMayor+" unidades cuadradas.");
	}
	
}

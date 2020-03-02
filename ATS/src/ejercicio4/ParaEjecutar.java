package ejercicio4;

import java.util.Scanner;

import ejercicio2.Movimiento;

public class ParaEjecutar {
	
	public static int atletaGanador(Atleta a[]) {
		int indice=0;
		float tiempo=a[0].getTiempoCarrera();
		for(int i=0;i<a.length;i++) {
			if(tiempo>a[i].getTiempoCarrera()) {
				tiempo=a[i].getTiempoCarrera();
				indice=i;
			}
		}
		return indice;
	}
	
	
	public static void main(String[] args) {
		Scanner n =  new Scanner(System.in);
		int cantAtletas, numAtleta, indiceAtletaGanador;
		String nombreAtleta;
		float tiempoCarrera;
		Movimiento.bienvenida();
		
		System.out.print("\nPor favor indique la cantidad de atletas a registrar en el sistema: ");
		cantAtletas=n.nextInt();
		
		Atleta a[]=new Atleta[cantAtletas];
		
		for(int i=0; i<a.length;i++) {
			System.out.println("\n"+(i+1)+".- Por favor, ingrese la información del atleta: ");
			System.out.print("Número de atleta:");
			numAtleta=n.nextInt();
			System.out.print("Nombre del(de la) atleta: ");
			n.nextLine();
			nombreAtleta=n.nextLine();
			System.out.print("Tiempo de carrera: ");
			tiempoCarrera=n.nextFloat();
			
			a[i]=new Atleta(numAtleta, nombreAtleta, tiempoCarrera);
		}
		
		indiceAtletaGanador=atletaGanador(a);
		
		System.out.println("\nEl(la) atleta que ganó la carrera es: ");
		n.nextLine();
		a[indiceAtletaGanador].mostrarDatos();
	}
	
	
}

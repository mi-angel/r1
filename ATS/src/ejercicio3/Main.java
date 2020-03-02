package ejercicio3;

import java.util.Scanner;
import ejercicio2.Movimiento;

public class Main {
	static int numVehiculos;
	
	
	public static int indiceAutoMasBarato(Vehiculo autos[]) {
		int indice=0;
		float precio;
		
		precio=autos[0].getPrecio();
		
		for(int i=1;i<autos.length;i++) {
			if(precio>autos[i].getPrecio()) {
				precio=autos[i].getPrecio();
				indice=i;
			}
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		String marca, modelo;
		float precio;
		int indiceAutoMasBarato;
		
		Movimiento.bienvenida();
		System.out.print("Por favor, digite el número de vehículos que ingresará en el sistema: ");
		numVehiculos=n.nextInt();
		
		Vehiculo autos[] = new Vehiculo[numVehiculos];
		
		for(int i=0;i<autos.length;i++) {
			System.out.println("\nPor favor digite la información del auto número "+(i+1)+": ");
			n.nextLine();
			System.out.print("Marca: ");
			marca=n.nextLine();
			System.out.print("Modelo: ");
			modelo=n.nextLine();
			System.out.print("Precio: ");
			precio=n.nextFloat();
			
			autos[i]=new Vehiculo(marca, modelo, precio);
		}
		
		indiceAutoMasBarato=indiceAutoMasBarato(autos);
		System.out.println("\nEl auto más barato es: \n");
		autos[indiceAutoMasBarato].mostrarDatos();
	}
}


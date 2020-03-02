package ejercicio7_SoccerTeam;

import java.util.Scanner;
import java.util.ArrayList;

	/*
	 * Crear un programa para simular un equipo de futbol
	 * (futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:
	 * --Una superclase Persona, que tendr� los siguientes datos: nombre, apellido, edad.
	 * --La subclase Futbolista tendr� los siguientes datos: dorsal y posici�n.
	 * --La subclase Entrenador tendr� de dato la estrategia que utiliza.
	 * --La subclase Doctor, la titulaci�n y los a�os de experiencia.
	 * 
	 * Hacer un men� donde se tengan las siguientes opciones: 
	 * --Viaje de equipo
	 * --Entrenamiento
	 * --Partido de futbol
	 * --Planificar entrenamiento
	 * --Entrevista
	 * --Curar lesi�n 
	 */

public class Principal {
	static Scanner n = new Scanner(System.in);
	static ArrayList<Persona> miembroEquipo = new ArrayList<Persona>();
	
	public static void bienvenida() {
		System.out.print("�Bienvenido(a)!\n"
				+ "Vamos a trabajar con un equipo de futbol.\n");
	}
	
	public static void integrarEquipo() {
		int opcion;
		char otro;
		
		do {
			do {
				System.out.print("\nPor favor, digite una de las opciones siguientes para a�adir a un integrante del equipo a la actividad: \n\n"
							+ "1.- Futbolista\n"
							+ "2.- Entrenador\n"
							+ "3.- Doctor\n\n"
							+ "Opci�n: ");
				opcion=n.nextInt();
				System.out.println();
				switch (opcion) {
				case 1: agregarFutbolista();//agregarFutbolista;
					break;
				case 2: agregarEntrenador();//agregarEntrenador;
					break;
				case 3: agregarDoctor();//agregarDoctor;
					break;
				}
				
			}while(opcion<1||opcion>3);
			System.out.println("�Desea agregar a otro integrante? s/n");
			otro=n.next().charAt(0);
		}while(otro=='s'||otro=='S');
	}
	
	public static void agregarFutbolista() {
		String nombre;
		String apellido;
		int edad;
		int dorsal;
		String posicion;
		
		n.nextLine();
		System.out.print("\nPor favor, digite el nombre del futbolista: ");
		nombre=n.nextLine();
		System.out.print("\nPor favor, digite el apellido del futbolista: ");
		apellido=n.nextLine();
		System.out.print("\nPor favor, digite la edad del futbolista: ");
		edad=n.nextInt();
		System.out.print("\nPor favor, digite el n�mero de la camisa del futbolista: ");
		dorsal=n.nextInt();
		n.nextLine();
		System.out.print("\nPor favor, digite la posici�n del futbolista: ");
		posicion=n.nextLine();
		
		Futbolista futbolista = new Futbolista(nombre, apellido, edad, dorsal, posicion);
		
		miembroEquipo.add(futbolista);
	}
	
	public static void agregarEntrenador() {
		String nombre;
		String apellido;
		int edad;
		String estrategia;
		
		n.nextLine();
		System.out.print("\nPor favor, digite el nombre del Entrenador: ");
		nombre=n.nextLine();
		System.out.print("\nPor favor, digite el apellido del Entrenador: ");
		apellido=n.nextLine();
		System.out.print("\nPor favor, digite la edad del Entrenador: ");
		edad=n.nextInt();
		n.nextLine();
		System.out.print("\nPor favor, digite la estrategia del entrenador: ");
		estrategia=n.nextLine();
		
		Entrenador entrenador = new Entrenador(nombre, apellido, edad, estrategia);
		
		miembroEquipo.add(entrenador);
	}
	
	public static void agregarDoctor() {
		String nombre;
		String apellido;
		int edad;
		String titulo;
		int experiencia;
		
		n.nextLine();
		System.out.print("\nPor favor, indique el nombre del Doctor: ");
		nombre=n.nextLine();
		System.out.print("\nPor favor, indique el apellido del Doctor: ");
		apellido=n.nextLine();
		System.out.print("\nPor favor, indique la edad del Doctor: ");
		edad=n.nextInt();
		n.nextLine();
		System.out.print("\nPor favor, indique el t�tulo del Doctor: ");
		titulo=n.nextLine();
		System.out.print("\nPor favor, indique los a�os de experiencia del Doctor: ");
		experiencia=n.nextInt();
		
		Doctor doctor = new Doctor(nombre, apellido,edad,experiencia, titulo);
		
		miembroEquipo.add(doctor);
	}
	
	public static void mostrarDatos() {
		for(Persona pers: miembroEquipo) {
			System.out.println(pers.toString());
			System.out.println();
		}
	}
	
	
	public static void viajeEquipo() {
		String destino;
		String oponente;
		n.nextLine();
		System.out.print("\nPor favor, ingrese el destino del viaje: ");
		destino=n.nextLine();
		System.out.print("\nPor favor, indique el nombre del equipo al que se enfrentar�n: ");
		oponente=n.nextLine();
		System.out.print("\nAhora por favor indique la informaci�n de los integrantes del equipo que ir�n de viaje.");
		
		integrarEquipo();
		System.out.print("El viaje se realizar� a "+destino+" para enfrentarse a "+oponente+".\n\n"
				+ "Los integrantes del equipo convocados son: \n\n");
		mostrarDatos();
		
	}
	
	
	public static void main(String[] args) {
		int opcion;
		char accion;
		
		bienvenida();
		
		do {
			do {
				System.out.print("Por favor, digite el n�mero de la acci�n que desea realizar, de acuerdo al siguiente men�: \n\n"
						+ "1.- Viaje en equipo\n"
						+ "2.- Entrenamiento\n"
						+ "3.- Partido de futbol\n"
						+ "4.- Planificar entrenamiento\n"
						+ "5.- Entrevista\n"
						+ "6.- Curar lesion\n\n"
						+ "Opci�n: ");
				opcion=n.nextInt();
			}while(opcion<1||opcion>6);
			
			switch (opcion) {
			case 1: viajeEquipo();//viajeEquipo
				break;
			case 2: //Entrenamiento
				break;
			case 3: //Partido de futbol
				break;
			case 4: //Planificar entrenamiento
				break;
			case 5: //Entrevista
				break;
			case 6: //Curar lesion
				break;
			}
			
			System.out.print("�Desea realizar alguna otra acci�n? s/n: ");
			accion=n.next().charAt(0);
		}while(accion=='s'|| accion=='S');
	}
}

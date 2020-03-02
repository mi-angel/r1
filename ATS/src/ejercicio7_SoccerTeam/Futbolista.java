package ejercicio7_SoccerTeam;

public class Futbolista extends Persona{
	private int dorsal;
	private String posicion;
	
	public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
		super(nombre, apellido, edad);
		this.dorsal=dorsal;
		this.posicion=posicion;
	}
	
	public String toString() {
		return "Futbolista: "+super.toString()
				+ "N�mero de camisa: "+dorsal+"\n"
						+ "Posci�n: "+posicion;
	}
	
	
}

package ejercicio7_SoccerTeam;

public class Doctor extends Persona{
	private int experiencia;
	private String titulo;
	
	public Doctor(String nombre, String apellido, int edad, int experiencia, String titulo) {
		super(nombre, apellido, edad);
		this.experiencia=experiencia;
		this.titulo=titulo;
	}
	
	public String toString() {
		return "Doctor: \n"+super.toString()
				+ "Título: "+titulo+"\n"
				+ "Años de experiencia: "+experiencia;
	}
	
	
}

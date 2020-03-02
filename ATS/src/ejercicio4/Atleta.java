package ejercicio4;
	/*
	 * Construr un programa para una competencia de atletismo,
	 * el programa debe gestionar una serie de atletas caracterizados
	 * por su número de atleta, nombre y tiempo de carrera, al final 
	 * el programa debe mostrar los datos del atleta ganador de la carrera.
	 */
public class Atleta {
	private int numAtleta;
	private String nombreAtleta;
	private float tiempoCarrera;
	
	public Atleta(int numAtleta, String nombreAtleta, float tiempoCarrera) {
		this.numAtleta=numAtleta;
		this.nombreAtleta=nombreAtleta;
		this.tiempoCarrera=tiempoCarrera;
	}
	
	public float getTiempoCarrera(){
		return tiempoCarrera;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombreAtleta+".\n"
						+ "Número: "+numAtleta+".\n"
						+ "Tiempo de carrera: "+tiempoCarrera+".");
	}
	
	

}

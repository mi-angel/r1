package polimorfismo;

public class Avion extends Vehiculo{
	
	private String nombreAerolinea;

	public Avion(String nombre, int nPasajeros, String tipo, String combustible, String nombreAerolinea) {
		super(nombre, nPasajeros, tipo, combustible);
		this.nombreAerolinea  = nombreAerolinea;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+".\n"
				+ "Número de pasajeros: "+nPasajeros+".\n"
				+ "Tipo: "+tipo+".\n"
				+ "Combustible: "+combustible+"\n"
				+ "Nombre de la aerolínea: "+nombreAerolinea+".");
	}
	
}

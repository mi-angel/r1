package polimorfismo;

public class Barco extends Vehiculo{
	
	private String nombreCapitan;
	
	public Barco(String nombre, int nPasajeros, String tipo, String combustible, String nombreCapitan) {
		super(nombre, nPasajeros, tipo, combustible);
		this.nombreCapitan = nombreCapitan;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+".\n"
				+ "Número de pasajeros: "+nPasajeros+".\n"
				+ "Tipo: "+tipo+".\n"
				+ "Combustible: "+combustible+"\n"
				+ "Nombre del Capitan: "+nombreCapitan+".");
	}
	
	
}

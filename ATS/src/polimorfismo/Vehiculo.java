package polimorfismo;

public class Vehiculo {
	protected String nombre;
	protected int nPasajeros;
	protected String tipo;
	protected String combustible;
	
	public Vehiculo(String nombre, int nPasajeros, String tipo, String combustible) {
		this.nombre = nombre;
		this.nPasajeros = nPasajeros;
		this.tipo = tipo;
		this.combustible = combustible;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+".\n"
						+ "Número de pasajeros: "+nPasajeros+".\n"
						+ "Tipo: "+tipo+".\n"
						+ "Combustible: "+combustible+".");
	}
}

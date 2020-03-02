package polimorfismo;

public class Pedalea extends Vehiculo{
	private String comentario;
	
	public Pedalea(String nombre, int nPasajeros, String tipo, String combustible, String comentario) {
		super(nombre, nPasajeros, tipo, combustible);
		this.comentario=comentario;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+".\n"
				+ "Número de pasajeros: "+nPasajeros+".\n"
				+ "Tipo: "+tipo+".\n"
				+ "Combustible: "+combustible+"\n"
				+ "¿Qué se siente desplazarse en este vehículo? "+comentario+".");
	}
}

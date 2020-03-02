package polimorfismo;

public class Carro extends Vehiculo{
	private String modelo;
	
	public Carro(String nombre, int nPasajeros, String tipo, String combustible, String modelo) {
		super(nombre, nPasajeros, tipo, combustible);
		this.modelo = modelo;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre+".\n"
				+ "Número de pasajeros: "+nPasajeros+".\n"
				+ "Tipo: "+tipo+".\n"
				+ "Combustible: "+combustible+"\n"
				+ "Modelo: "+modelo+".");
	}
	
	
}

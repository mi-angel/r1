package polimorfismo;

public class principal {
	public static void main(String[] args) {
		Vehiculo vehiculos[]= new Vehiculo[4]; 
		
		vehiculos[0]= new Avion("Avi�n presidencial", 50, "transporte aereo", "gasavi�n.", "Gobierno de M�xico");
		vehiculos[1]=new Barco("El perla negra.", 35, "transporte mar�timo", "viento a las velas.", "Miguel Sparrow �arggggsss!");
		vehiculos[2]=new Carro("F�rmula 1", 2, "transporte terrestre", "gasolina.", "Ferrari");
		vehiculos[3]=new Pedalea("miVici", 1, "transporte terrestre", "la energ�a del pasajero", "es mejor que ir como sardina en el cami�n =)");
		
		for(Vehiculo medioTransporte: vehiculos) {
			medioTransporte.mostrarDatos();
			System.out.println();
		}
	}
}

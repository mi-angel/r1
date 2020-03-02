package polimorfismo;

public class principal {
	public static void main(String[] args) {
		Vehiculo vehiculos[]= new Vehiculo[4]; 
		
		vehiculos[0]= new Avion("Avión presidencial", 50, "transporte aereo", "gasavión.", "Gobierno de México");
		vehiculos[1]=new Barco("El perla negra.", 35, "transporte marítimo", "viento a las velas.", "Miguel Sparrow ¡arggggsss!");
		vehiculos[2]=new Carro("Fórmula 1", 2, "transporte terrestre", "gasolina.", "Ferrari");
		vehiculos[3]=new Pedalea("miVici", 1, "transporte terrestre", "la energía del pasajero", "es mejor que ir como sardina en el camión =)");
		
		for(Vehiculo medioTransporte: vehiculos) {
			medioTransporte.mostrarDatos();
			System.out.println();
		}
	}
}

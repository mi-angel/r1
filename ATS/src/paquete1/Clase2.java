package paquete1;



public class Clase2 {

	Clase2 persona1 = new Clase2();
	public static void main(String[] args) {
		Clase1 persona1 = new Clase1();
		Clase1 persona2 = new Clase1("Audi", 2020);
		
		persona1.nombre="Andrés";
		persona1.setFrase("va a la escuela");
		System.out.println(persona1.UnMensaje());
		
		
		
	}
}

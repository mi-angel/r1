package sobreescritura;

public class principal {
	
	/*
	 * La sobreescritura de m�todos refiere a la creaci�n de m�todos con el mismo nombre en clases con parentesco, las palabras clave son @Override y extends (para relaci�n de parentesco entre clases "herencia")
	 */
	
	public static void main(String[] args) {
		Persona educada = new Persona();
		Perro malo = new Perro();
		Vaca sagrada = new Vaca();
		
		educada.comer();
		malo.comer();
		sagrada.comer();
		
		educada.expresion("fracais.");
		malo.expresion(35);
		sagrada.expresion("Estoy pastando y comiendo.");
		
	}
}

package sobreescritura;

public class Persona extends Animal{
	
	
	@Override //A veces no se necesita especificar
	public void comer() {
		System.out.println("Estoy comiendo sentado en una silla frente a la mesa.");
	}
	
	//No se necesita agregar la palabra @Override cuando la sobreescritura incluye la adición de parámetros a pesar de que el método tiene el mismo nombre, para que sea una sobreescritura el método deberá coincidir en sus parámetros y tipo de éstos.
	@Override
	public void expresion(String idioma) {
		System.out.println("La articulación de sonidos da origen al lenguaje hablado y a través de este me comunico en: "+idioma);
	}
	
	
}

package sobreescritura;

public class Persona extends Animal{
	
	
	@Override //A veces no se necesita especificar
	public void comer() {
		System.out.println("Estoy comiendo sentado en una silla frente a la mesa.");
	}
	
	//No se necesita agregar la palabra @Override cuando la sobreescritura incluye la adici�n de par�metros a pesar de que el m�todo tiene el mismo nombre, para que sea una sobreescritura el m�todo deber� coincidir en sus par�metros y tipo de �stos.
	@Override
	public void expresion(String idioma) {
		System.out.println("La articulaci�n de sonidos da origen al lenguaje hablado y a trav�s de este me comunico en: "+idioma);
	}
	
	
}

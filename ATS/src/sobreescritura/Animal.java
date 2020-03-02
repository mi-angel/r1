package sobreescritura;
	
public class Animal {
	static int idioma;
	static String idioma1; //No se permite la adición de variables con el mismo nombre pero de diferente tipo
	
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	
	public void expresion() {
		System.out.println("Produce sonidos para comunicarse.");
	}

	public void expresion(int idioma) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void expresion(String idioma1) {
		
	}
}

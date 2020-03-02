package masMetodos;

public class MetodoSobrecargado {

	//Atributos
	String nombre, frase;
	int edad;
	
	
	/*
	 * Un método constructor sobrecargado y, en general la sobrecarga de métodos, se refiere a métodos con el mismo nombre,
	 * con parámetros distintos sin impotar el tipo de retorno.
	 * 
	 * Por ejemplo, crearé el método constructor "MetodoSobrecarcado" con los atributos "nombre" y "edad" y lo crearé
	 * de nuevo con el atributo frase.
	 * 
	 * Luego crearé otro método diferente al constructor que muestra un mensaje y generaré su sobrecarga creándolo de nuevo con un la adición de un parámetro.
	 */
	
	public MetodoSobrecargado(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public MetodoSobrecargado(String frase) {
		this.frase=frase;
	}
	
	
	public void HolaPersona() {
		System.out.println("El otro día conocí a una persona que se llama "+nombre+" y tiene "+edad+" años");
	}
	
	public void HolaPersona(String frase2) {
		System.out.println("El otro día conocí a una persona que me dijo estas palabras '"+frase+" y también "+frase2+"'.");
	}
	
}

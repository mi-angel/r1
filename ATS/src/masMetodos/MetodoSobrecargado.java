package masMetodos;

public class MetodoSobrecargado {

	//Atributos
	String nombre, frase;
	int edad;
	
	
	/*
	 * Un m�todo constructor sobrecargado y, en general la sobrecarga de m�todos, se refiere a m�todos con el mismo nombre,
	 * con par�metros distintos sin impotar el tipo de retorno.
	 * 
	 * Por ejemplo, crear� el m�todo constructor "MetodoSobrecarcado" con los atributos "nombre" y "edad" y lo crear�
	 * de nuevo con el atributo frase.
	 * 
	 * Luego crear� otro m�todo diferente al constructor que muestra un mensaje y generar� su sobrecarga cre�ndolo de nuevo con un la adici�n de un par�metro.
	 */
	
	public MetodoSobrecargado(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public MetodoSobrecargado(String frase) {
		this.frase=frase;
	}
	
	
	public void HolaPersona() {
		System.out.println("El otro d�a conoc� a una persona que se llama "+nombre+" y tiene "+edad+" a�os");
	}
	
	public void HolaPersona(String frase2) {
		System.out.println("El otro d�a conoc� a una persona que me dijo estas palabras '"+frase+" y tambi�n "+frase2+"'.");
	}
	
}

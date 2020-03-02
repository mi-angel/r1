package paquete1;

public class Clase1 {
	//Atributos
	

	
	public String nombre; //este atributo es p�blico, lo que significa que puede ser utilizado por cualquier clase incluso, fuera del paquete donde se encuentra
	int ch; //n�mero de chocolates que comi� //El atributo tiene una restricci�n por default, lo que significa que s�lo puede ser utilizado por las clases dentro del mismo paquete
	
	//Cuando los atributos tienen el modificador de acceso "private" se dice que est�n encapsulados, lo que indica que s�lo puede ser manipulado por m�todos dentro de la misma clase, como los metodos accesores setter y getter
	
	private String frase;
	private int ingreso, d�asLaborados, diasDescansados;
	private final String marca;
	private int modelo;
	
	//M�todo constructor sin atributos
	public Clase1() {
		this.marca = "";
	}
	
	//M�todo constructor con los atributos marca y modelo
	public Clase1(String marca, int modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	

	
	//Setter y getter del String marca, jajajaja, no se permiten porque ESE ATRIBUTO ES CONSTANTE, luego entonces no se necesita modificar. Sin embargo, s� se puede acceder al valor del atributo mediante un m�todo getter.
	/*public void setMarca(String marca) {
		this.marca=marca;
	}*/
	public String getMarca() {
		return marca;
	}
	
	
	
	//setter y getter del int modelo
	
	
	
	
	//Setter y getter del atributo ingreso
	public void setIngreso(int ingreso) {
		this.ingreso=ingreso;
	}
	public int getIngreso() {
		return ingreso;
	}
	
	
	
	//Setter y getter del atributo diasLaborados
	public void setD�asLaborados(int d�asLaborados) {
		this.d�asLaborados=d�asLaborados;
	}
	public int getD�asLaborados() {
		return d�asLaborados;
	}
	
	
	//Setter y getter del atributo d�asDescansados
	public void setDiasDescansados(int diasDescansados) {
		this.diasDescansados = diasDescansados;
	}
	public int getDiasDescansados() {
		return diasDescansados;
	}
	
	

	public String UnMensaje() {
		return getFrase();
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	
}

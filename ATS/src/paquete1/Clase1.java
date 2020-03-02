package paquete1;

public class Clase1 {
	//Atributos
	

	
	public String nombre; //este atributo es público, lo que significa que puede ser utilizado por cualquier clase incluso, fuera del paquete donde se encuentra
	int ch; //número de chocolates que comió //El atributo tiene una restricción por default, lo que significa que sólo puede ser utilizado por las clases dentro del mismo paquete
	
	//Cuando los atributos tienen el modificador de acceso "private" se dice que están encapsulados, lo que indica que sólo puede ser manipulado por métodos dentro de la misma clase, como los metodos accesores setter y getter
	
	private String frase;
	private int ingreso, díasLaborados, diasDescansados;
	private final String marca;
	private int modelo;
	
	//Método constructor sin atributos
	public Clase1() {
		this.marca = "";
	}
	
	//Método constructor con los atributos marca y modelo
	public Clase1(String marca, int modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	

	
	//Setter y getter del String marca, jajajaja, no se permiten porque ESE ATRIBUTO ES CONSTANTE, luego entonces no se necesita modificar. Sin embargo, sí se puede acceder al valor del atributo mediante un método getter.
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
	public void setDíasLaborados(int díasLaborados) {
		this.díasLaborados=díasLaborados;
	}
	public int getDíasLaborados() {
		return díasLaborados;
	}
	
	
	//Setter y getter del atributo díasDescansados
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

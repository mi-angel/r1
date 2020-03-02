package los4pilaresPOO;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;
	
	//En este caso, el constructor de la Clase Rectángulo envía el valor de la cantidad de lados al constructor de la Clase polígono.
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1=lado1;
		this.lado2=lado2;
	}
	@Override
	public double area() {
		return lado1*lado2; 
	}

	@Override
	public String toString() {
		return "Rectángulo.\n"
				+super.toString()+"\n"
				+ "Lado 1: " + lado1 + "\n"
				+ "Lado2 : " + lado2 + ".";
	}
	
	
}

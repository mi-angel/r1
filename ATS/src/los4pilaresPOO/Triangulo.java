package los4pilaresPOO;

public class Triangulo extends Poligono{
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public String toString() {
		return "Triangulo.\n"
				+super.toString()+"\n"
				+ "Lado 1: "+lado1+".\n"
				+ "Lado 2: "+lado2+".\n"
				+ "Lado 3: "+lado3+".\n";
	}
	
	public double area() {
		/*
		 * Usaremos la fórmula de Herón
		 * Donde p = (l1+l2+l3)/2
		 * raiz cuadrada de (p*(p-l1)*(p-l2)*(p-l3))
		 */
		double p=(lado1+lado2+lado3)/2;
		
		return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
	}
}

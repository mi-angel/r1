package ejercicio5;
	/*
	 * Dise�ar un programa para trabajar con tri�ngulos is�sceles. 
	 * Para ello defina los atributos necesarios que se requieren, 
	 * proporcione m�todos de consulta, un m�todo constructor e 
	 * implemente m�todos para calcular el per�metro y el �rea de un tri�ngulo, 
	 * adem�s implementar un m�todo que a partir de un arreglo de tri�ngulos devuelva
	 * el �rea del tri�ngulo de mayor superficie.
	 */
public class TriangulosIsosceles {
	private double base;
	private double lado;
	
	public TriangulosIsosceles(double base ,double lado) {
		this.base=base;
		this.lado=lado;
	}
	
	public double getPerimetro() {
		double perimetro = base+lado*2;
		return perimetro;
	}
	
	public double getArea() {
		double area = (base*Math.sqrt((lado*lado) - ((base*base)/4)))/2;
		return area;
	}	
	
	public String mostrarDatos() {
		return "Base: "+base+"\n"
				+ "Lado:"+lado+"\n"
				+ "Area: "+getArea()+"\n"
				+ "Per�metro: "+getPerimetro()+"\n";
	}
}

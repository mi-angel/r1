package ejercicio1;

/*
 * Construir un programa que calcule el �rea y el per�metro de un cuadril�tero dada la longitud de sus lados. 
 * Los valores de la longitud deber�n introducirse por l�nea de �rdenes, si es un cuadrado s�lo se proporcionar�
 * la longitud de uno de los lados al constructor. 
 */

public class Cuadrilatero {
	float lado1;
	float lado2;
	
	//M�todo constructor para los cuadril�teros no cuadrados
	public Cuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//M�todo constructor para el cuadrado
	public Cuadrilatero(float lado1) {
		this.lado1=this.lado2=lado1;
	}
	
	//M�todo para calcular el �rea y el per�metro
	public float getPerimetro(float lado1, float lado2) {
		float perimetro = (lado1*2) + (lado2*2);
		return perimetro;
	}
	
	//M�todo para calcular el �rea y el per�metro de un cuadrado
	public float getArea(float lado1, float lado2) {
		float area = lado1*lado2;
		return area;
	}
	
	
}

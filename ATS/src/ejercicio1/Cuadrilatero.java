package ejercicio1;

/*
 * Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus lados. 
 * Los valores de la longitud deberán introducirse por línea de órdenes, si es un cuadrado sólo se proporcionará
 * la longitud de uno de los lados al constructor. 
 */

public class Cuadrilatero {
	float lado1;
	float lado2;
	
	//Método constructor para los cuadriláteros no cuadrados
	public Cuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//Método constructor para el cuadrado
	public Cuadrilatero(float lado1) {
		this.lado1=this.lado2=lado1;
	}
	
	//Método para calcular el área y el perímetro
	public float getPerimetro(float lado1, float lado2) {
		float perimetro = (lado1*2) + (lado2*2);
		return perimetro;
	}
	
	//Método para calcular el área y el perímetro de un cuadrado
	public float getArea(float lado1, float lado2) {
		float area = lado1*lado2;
		return area;
	}
	
	
}

package ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cuadrilatero obj1;
	
		float lado1;
		float lado2;
		
		lado1=Float.parseFloat(JOptionPane.showInputDialog("¡Bienvenido(a)!\n"
				+ "Vamos a calcular el área y perímetro de un cuadrilátero.\n"
				+ "Para comenzar digite el valor del lado 1:"));
		
		lado2=Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite el valor del lado 2: "));
		
		if(lado1==lado2) {
			obj1=new Cuadrilatero(lado1);
		}
		else {
			obj1=new Cuadrilatero(lado1, lado2);
		}
		
		JOptionPane.showMessageDialog(null,"El área es: "+obj1.getArea(lado1, lado2)+"\n"
				+"El perímetro es: "+obj1.getPerimetro(lado1, lado2)+"\n"
						+ "¡Muchas gracias!");
		
		
	}
}

package paquete2;

import paquete1.Clase1;
import javax.swing.JOptionPane;

public class Clase3 {
	//los miembros est�ticos de una clase se forman mediante la palabra static, esta palabra asigna el atributo directamente a la clase y ya no a los objetos, de ah� que para mostrarlos ya no sea necesario crear objetos.
	
	private static int a�os;
	
	private static int suma(int a, int b) {
		a�os=a+b;
		return a�os;
	}
	
	public static void main(String[] args) {
		Clase1 persona2 = new Clase1();
		persona2.nombre="Sofia";
		persona2.setFrase("Woooorales!!! S� funciona!!!  =) ");
		System.out.println(persona2.UnMensaje());
		
		Clase3 persona3, persona4, persona5;
		persona3 = new Clase3();
		persona4 = new Clase3();
		persona5 = new Clase3();
		
		
		
		/*Clase3.a�os=28;
		JOptionPane.showMessageDialog(null,"Es el n�mero actual es: "+Clase3.a�os);//Para mandar llamar el valor est�tico no se necesita agregar el nombre de la clase
		Clase3.a�os=34;
		JOptionPane.showMessageDialog(null,"Es el n�mero actual es: "+Clase3.a�os);//Para mandar llamar el valor est�tico no se necesita agregar el nombre de la clase
		*/
		System.out.println("La suma es "+persona3.suma(3, 4));
		persona3.a�os=25;
		System.out.println("La edad de todas las personas es "+persona4.a�os+"\n"
				+ "de verdad???? s�, son "+persona5.a�os+".");
	}
}

package classAndMethods;

import javax.swing.JOptionPane;

public class MetodoConstructor {
	
	//Atributos
	String nombre, colorFavorito;
	int edad;
	
	/*
	 * M�todo constructor, los par�metros son opcionales, en este caso los voy 
	 * a agregar para hacer que sea obligatorio a�adirlos al crear un nuevo objeto.
	 * 
	 * La palabra this se utiliza para especificar cu�l es el atributo ya que los par�metros
	 * del m�todo constructor tienen el mismo nombre que los atributos. Si no se quisiera utilizar,
	 * el nombre de los par�metros tendr�a que ser diferente al de los atributos.
	 */
	public MetodoConstructor(String nombre, int edad, String _colorFavorito) {
		this.nombre = nombre;
		this.edad = edad;
		colorFavorito = _colorFavorito;
	}
	
	public void MostrarInfo() {
		JOptionPane.showMessageDialog(null, "Te presento a "+nombre+",\n "
				+ "tiene "+edad+" a�os y \n"
						+ "su color favorito es el "+colorFavorito+".");
	}
}

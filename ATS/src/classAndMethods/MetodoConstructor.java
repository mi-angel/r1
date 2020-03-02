package classAndMethods;

import javax.swing.JOptionPane;

public class MetodoConstructor {
	
	//Atributos
	String nombre, colorFavorito;
	int edad;
	
	/*
	 * Método constructor, los parámetros son opcionales, en este caso los voy 
	 * a agregar para hacer que sea obligatorio añadirlos al crear un nuevo objeto.
	 * 
	 * La palabra this se utiliza para especificar cuál es el atributo ya que los parámetros
	 * del método constructor tienen el mismo nombre que los atributos. Si no se quisiera utilizar,
	 * el nombre de los parámetros tendría que ser diferente al de los atributos.
	 */
	public MetodoConstructor(String nombre, int edad, String _colorFavorito) {
		this.nombre = nombre;
		this.edad = edad;
		colorFavorito = _colorFavorito;
	}
	
	public void MostrarInfo() {
		JOptionPane.showMessageDialog(null, "Te presento a "+nombre+",\n "
				+ "tiene "+edad+" años y \n"
						+ "su color favorito es el "+colorFavorito+".");
	}
}

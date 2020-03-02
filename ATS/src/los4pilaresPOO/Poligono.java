package los4pilaresPOO;


	/*
	 *Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos)
	 *el programa debe ser capaz de almacenar un arreglo de N triángulos y rectángulos,
	 *y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 
	 *
	 *Una super clase llamada Polígono
	 *Una sub clase llamada Rectángulo
	 *Una sub clase llamada Triángulo
	 */
public abstract class Poligono {
	protected int nLados;

	public Poligono(int nLados) {
		this.nLados=nLados;
	}
	
	public int getNlados() {
		return nLados;
	}
	
	public void setNlados(int nLados) {
		this.nLados=nLados;
	}
	
	public abstract double area();
	
	@Override
	public String toString() {
		return "El número de lados es:" + nLados + ".";
	}
	
	

}

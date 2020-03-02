package los4pilaresPOO;


	/*
	 *Hacer un programa para calcular el �rea de Pol�gonos (Tri�ngulos y Rect�ngulos)
	 *el programa debe ser capaz de almacenar un arreglo de N tri�ngulos y rect�ngulos,
	 *y al final mostrar el �rea y los datos de cada uno. Para ello se tendr� lo siguiente: 
	 *
	 *Una super clase llamada Pol�gono
	 *Una sub clase llamada Rect�ngulo
	 *Una sub clase llamada Tri�ngulo
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
		return "El n�mero de lados es:" + nLados + ".";
	}
	
	

}

package abstracta;

public class Planta extends SerVivo{
	@Override
	public void alimentarse() {
		System.out.println("Las plantas realizamos la fotosíntesis y se nos sube el azucar =P");
	}
	
	public String caracteristica() {
		return "Algunas presentan fototactismo (tenemos una pequeña adicción a la luz ;) ";
	}
}

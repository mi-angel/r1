package sobreescritura;

public class Perro extends Animal {
	@Override //A veces no se necesita especificar
	public void comer() {
		System.out.println("Estoy comiendo croquetas wuau wuau!!!");
	}
	
	public void expresion(int ladridos) {
		System.out.println("Por lo general ladro "+ladridos+" veces al día. Wuau! Wuau!");
	}
}

package sobreescritura;

public class Vaca extends Animal{
	@Override //A veces no se necesita especificar 
	public void comer() {
		System.out.println("Estoy comiendo muuuuuuucho pasto.");
	}
	
	public void expresion(String mu) {
		System.out.println("Muuuuuuuuuuuuucho gusto!! "+mu);
	}
}

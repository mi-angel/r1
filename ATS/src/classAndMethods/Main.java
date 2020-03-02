package classAndMethods;

public class Main {
	public static void main(String[] args) {
	
		MetodoConstructor persona1, persona2, persona3;
		
		persona1= new MetodoConstructor("Ivan",32,"azul marino");
		persona2= new MetodoConstructor("Leo",24,"verde");
		persona3= new MetodoConstructor("Osvaldo", 23, "blanco");
		
		persona1.MostrarInfo();
		persona2.MostrarInfo();
		persona3.MostrarInfo();
	}
}

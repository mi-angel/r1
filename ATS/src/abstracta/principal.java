package abstracta;

public class principal {
	public static void main(String[] args) {
		//SerVivo ave = new SerVivo(); el objeto 'ave' no se puede crear porque la clase de la cual se origina es abstracta
		Planta verde = new Planta();
		//Animal perro = new Animal(); el objeto 'perro' no se puede crear porque la clase de la cual se origina es abstracta
		AnimalCarnivoro leon = new AnimalCarnivoro();
		AnimalHerbivoro vaca = new AnimalHerbivoro();
		
		
		verde.alimentarse();
		System.out.println(verde.caracteristica()+"\n");
		
		leon.alimentarse();
		System.out.println(leon.caracteristica()+"\n");
		
		vaca.alimentarse();
		System.out.println(vaca.caracteristica()+"\n");
	}
}

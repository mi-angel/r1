package abstracta;

public class AnimalHerbivoro extends SerVivo{
	public void alimentarse() {
		System.out.println("Los animales herbivoros se alimentan de plantas.");
	}
	
	public String caracteristica() {
		return "Prefieren ser vegetarianus. =P ";
	}
}

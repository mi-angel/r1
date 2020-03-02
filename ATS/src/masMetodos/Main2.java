package masMetodos;

public class Main2 {

	public static void main(String[] args) {
		MetodoSobrecargado persona1= new MetodoSobrecargado("Carmen", 45);
		persona1.HolaPersona();
		
		MetodoSobrecargado persona2=new MetodoSobrecargado("La vida es muy agradable");
		persona2.HolaPersona("divertida");
		
		MetodoSobrecargado persona3=new MetodoSobrecargado("Me gusta el chocolate");
		persona3.HolaPersona("me gusta la nieve de limón");
	}
}

package ejercicio6;

public class OperacionesComplejos {
	public static void main(String[] args) {
		String resultCompara;
		Complejos a= new Complejos();
		a.bienvenida();
		switch(a.desplegaMenu()) {
		case 1:
			a.ingresaComplejo();
			a.sumaReales();
			a.sumaImaginarios();
			a.resultadoSuma();
			break;
		case 2:
			a.ingresaComplejo();
			a.resultadoMult();
			break;
		case 3:
			a.ingresaComplejo();
			
			System.out.println("\n"+a.comparaComplejos());
			break;
		case 4:
			a.ingresaComplejoYReal();
			a.realMultComplejo();
			break;
		}
	}
}

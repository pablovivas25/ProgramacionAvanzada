package polimorfismo;

public class Main {
	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.saludar();
		Estudiante e1=new Estudiante();
		e1.darPresente();
		
		Persona p2=new Estudiante();
		p2.saludar();
		//p2.darPresente();
		/**Y esto sucede porque estamos considerando a la entidad como una Persona, no
como un Estudiante, por lo tanto no podemos requerir ninguna de las responsabilidades que no sean de Persona.**/
		
	}

}

package felinecougar;

public class Cougar extends Feline{
	public Cougar() {
		System.out.print("cougar ");
	}
	public static void main(String[] args) {
		///Cougar c1=new Cougar();
		new Cougar().go();//.go();
	}
	
	void go() {
		type ="c";
		System.out.print(this.type + super.type);
	}
	

}
/*
como podemos ver todos los constructores llaman por defecto al constructor de la clase 
superior a través de una llamada a super() (en este caso al constructor por defecto). 
Esto es debido a que los constructores no se heredan entre jerarquías de clases. 
Por lo tanto la palabra super() siempre es la primera línea de un constructor e invoca al constructor
 de la clase superior que comparta el mismo tipo de parametrización.
*/
package paquetepruebas;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Persona p1=new Persona("nombre1","apellido1",12345);
		System.out.println(p1);
		Persona p2=new Persona("nombre1","apellido1",12345);
		System.out.println(p2);
		String nombre1="nombre1";
		String nombre2="nombre1";
		///p1=p2;CON ESTO DIGO QUE P1 APUNTA A LA DIRECCION DE P2
		System.out.println(p1==p2);///ACA ESTA COMPARANDO REFERENCIAS(DIRECCIONES DE P1 Y P2)
		System.out.println(p1.equals(p2));///ACA ESTA COMPARANDO SI P1 Y P2 TIENEN EL MISMO CONTENIDO
		///EQUALS ES NECESARIO SOBREESCRIBIR CUANDO EL TIPO DE DATO NO SEA PRIMITIVO
		///SI ES PRIMITIVO NO HAY DRAMA
		System.out.println(nombre1.equals(nombre2));
		System.out.println("-----USO DE LA INTERFAZ CLONEABLE----");
		Persona p3=p2.clone();
		System.out.println(p3);
		///p2=p3;
		System.out.println(p2==p3);
		System.out.println(p2.equals(p3));
		///p1=p3;
		System.out.println(p1==p3);
		System.out.println(p1.equals(p3));
		
	}

}

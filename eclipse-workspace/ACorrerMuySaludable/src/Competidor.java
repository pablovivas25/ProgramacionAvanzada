
public class Competidor {
	private int edad;
	private String sexo;
	private int numero;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Competidor(int edad, String sexo,int numero) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.numero=numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}


public class Paciente implements Comparable<Paciente>{
	private int edad;
	
	public Paciente(int edad) {
		this.edad=edad;
		
	}
	@Override
	public int compareTo(Paciente o) {
		return o.edad-this.edad;
	}
	@Override
	public String toString() {
		return "Paciente [edad=" + edad + "]";
	}
	
	
}

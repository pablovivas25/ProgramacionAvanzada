import java.util.ArrayList;

public class Mazo {
	
	private ArrayList<Integer> listaReyes;
	
	private boolean [] reyes;

	public Mazo(ArrayList<Integer> listaReyes) {
		super();
		this.listaReyes = listaReyes;
		reyes=new boolean[this.listaReyes.size()*2];
	}

	
	public void setearReyes() {
		
		for(int i=0;i<this.listaReyes.size();i++)
			this.reyes[this.listaReyes.get(i)-1]=true;
	}

	public boolean[] getReyes() {
		return reyes;
	}
	
	
}

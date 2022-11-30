import java.util.ArrayList;
import java.util.List;

public class Sopa {
	private List<String> norte;
	private List<String> oeste;
	private List<String> este;
	private List<String> sur;
	
	private List<String> palabras_abuscar;
	private ArrayList<String> respuesta=new ArrayList<String>();
	private String [] resp;

	public Sopa(List<String> norte, List<String> oeste, List<String> este, List<String> sur,
			List<String> palabras_abuscar) {
		super();
		this.norte = norte;
		this.oeste = oeste;
		this.este = este;
		this.sur = sur;
		this.palabras_abuscar = palabras_abuscar;
		this.resp=new String[this.palabras_abuscar.size()];
	}

	public List<String> getNorte() {
		return norte;
	}

	public List<String> getOeste() {
		return oeste;
	}

	public List<String> getEste() {
		return este;
	}

	public List<String> getSur() {
		return sur;
	}

	public List<String> getPalabras_abuscar() {
		return palabras_abuscar;
	}
	
	public void resolver() {
		for(int i=0;i<this.palabras_abuscar.size();i++) {
			for(String s1:this.getEste()) {
				int encontro=s1.indexOf(this.palabras_abuscar.get(i));
				if(encontro!=-1) {
					this.resp[i]="E";
					//this.respuesta.add(""+(i+1)+" "+"E");
				}
			}

		}
		
		for(int i=0;i<this.palabras_abuscar.size();i++) {
			for(String s1:this.getOeste()) {
				int encontro=s1.indexOf(this.palabras_abuscar.get(i));
				if(encontro!=-1) {
					this.resp[i]="O";
				}
			}

		}
		
		for(int i=0;i<this.palabras_abuscar.size();i++) {
			for(String s1:this.getNorte()) {
				int encontro=s1.indexOf(this.palabras_abuscar.get(i));
				if(encontro!=-1) {
					this.resp[i]="N";
				}
			}

		}
		for(int i=0;i<this.palabras_abuscar.size();i++) {
			for(String s1:this.getSur()) {
				int encontro=s1.indexOf(this.palabras_abuscar.get(i));
				if(encontro!=-1) {
					this.resp[i]="S";
				}
			}

		}
		for(int i=0;i<resp.length;i++) {
			if(resp[i]!=null)
				System.out.println((i+1) + " "+resp[i]);
		}
			
	}
	

	
}


public class Corrupto {
	private int datos[];
	
	
	public Corrupto(int vec[]) {
		this.datos=vec;
	}
	
	public boolean esCorrupto(int dato) {
		return dato>8?true:false;
	}
	public int resolver2() {
		 int inicio = 0;
		 int primerCorrupto=-1;
		 int fin = this.datos.length - 1;
		 int pos;
		 while (inicio <= fin) {
		     pos = (inicio+fin) / 2;
		     if (esCorrupto(this.datos[pos])) {
		    	 primerCorrupto=pos;
		    	 fin=pos-1;
		     }
		     else {
		    	 inicio=pos+1;
		     }
		 }
		 	return primerCorrupto;
		    }
	
	public int  resolver1() {
		for(int i=0;i<this.datos.length;i++) {
			if(esCorrupto(this.datos[i])==true)
				return i;
		}
		return -1;
	}
	
	public static void main(String []args) {
		int datos[]= {7,8,8,9,10};
		Corrupto c = new Corrupto(datos);
		System.out.println(c.resolver1());
		System.out.println(c.resolver2());
	}
}

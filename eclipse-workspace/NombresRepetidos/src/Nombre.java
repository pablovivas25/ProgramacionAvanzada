import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Nombre implements Comparable{
	private int cantNombres;
	private int n;
	private ArrayList<String>nombres;
	private TreeMap<String,Integer> mapa;
	
	public Nombre(String path) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(path));
		
		this.cantNombres=entrada.nextInt();
		this.n=entrada.nextInt();
		this.nombres=new ArrayList<String>(this.cantNombres);
		this.mapa=new TreeMap<String,Integer>();
		
		while(entrada.hasNext()) {
			nombres.add(entrada.next());
		}
		
		for(String n:this.nombres) {
			int clave=1;
			if(mapa.get(n)!=null)
				clave=this.mapa.get(n)+1;
			mapa.put(n,clave);
			clave=1;
		}
		entrada.close();
	}
	
	

	@Override
	public int compareTo(Object o) {
		String n=(String)o;
		for(String n1:this.nombres) {
			if(n1.compareTo(n)<0)
				return -1;
			else 
				return 1;
		}
		return 0;
	}

public void resolver(String path) throws FileNotFoundException {
	PrintWriter salida=new PrintWriter(new File(path));
	
	Iterator<String> it=mapa.keySet().iterator();
	
	while(it.hasNext()) {
		String clave=it.next();
		
		if(mapa.get(clave)>this.n) {
			salida.println(clave +" " + mapa.get(clave));
		}
	}
	salida.close();
}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nombre other = (Nombre) obj;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		return true;
	}



	public void mostrarNombres() {
		for(String n:nombres)
			System.out.println(n.toString());
	}
	public void mostrarMap() {
		Iterator<String> it=mapa.keySet().iterator();
		
		while(it.hasNext()) {
			String clave=it.next();
			System.out.println(clave+" "+this.mapa.get(clave));
		}
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Letra {
	private int cantPalabras;
	private ArrayList<String> palabras;
	private HashMap<Character,Integer> letras;
	
	
	public Letra(String path) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(path));
		this.cantPalabras=entrada.nextInt();
		this.palabras=new ArrayList<String>(this.cantPalabras);
		this.letras=new HashMap<Character,Integer>(this.cantPalabras);
		
		while(entrada.hasNext()) {
			this.palabras.add(entrada.next());
		}
		for(String p:palabras) {
			char ini=p.charAt(0);
			int clave=1;
			if(this.letras.get(ini)!=null) 
				clave=this.letras.get(ini)+1;
			this.letras.put(ini, clave);
			
			char fin=p.charAt(p.length()-1);
			clave=1;
			
			
			if(this.letras.get(fin)!=null) 
				clave=this.letras.get(fin)+1;
			this.letras.put(fin, clave);
			
		}
		
		entrada.close();
	}
	public void resolver(String path) throws FileNotFoundException {
		PrintWriter salida=new PrintWriter(new File(path));
		int tamMaximo=0;
		Character letra = null;
		
		Iterator<Character> it=letras.keySet().iterator();
		
		while(it.hasNext()) {
			Character key=(Character)it.next();
			if(this.letras.get(key)>tamMaximo)
				tamMaximo=this.letras.get(key);
		}
		
		Iterator<Character> it2=letras.keySet().iterator();
		
		while(it2.hasNext()) {
			Character key2=(Character)it2.next();
		
			if(this.letras.get(key2)==tamMaximo) {
				letra=key2;
				salida.println(letra);
			}
		}
		
		for(String p1:this.palabras) {
			if(p1.charAt(0)==letra || p1.charAt(p1.length()-1)==letra) {
				salida.println(p1);
			}
		}
		salida.close();
	}

	
	}


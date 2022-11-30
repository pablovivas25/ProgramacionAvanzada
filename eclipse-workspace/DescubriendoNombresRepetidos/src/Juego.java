import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Juego {
	private int cantChicos;
	private int n;
	private Map<String ,Integer> palabras;
	
	

	public Juego(int cantChicos, int n, Map<String, Integer> palabras) {
		super();
		this.cantChicos = cantChicos;
		this.n = n;
		this.palabras = palabras;
	}

	public int getCantChicos() {
		return cantChicos;
	}

	public int getN() {
		return n;
	}

	public Map<String, Integer> getPalabras() {
		return palabras;
	}

	public Map<String,Integer> obtenerTopN(){
		///Ordeno el MAP
		List<Entry<String, Integer>> list = new ArrayList<>(this.palabras.entrySet());
		list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		
		Map<String,Integer> resultado =new HashMap<String,Integer>();
		
		///int cant = 0;
		
		
			for (int i=0;i<list.size();i++) {
				String clave =list.get(i).getKey();
				Integer valor=list.get(i).getValue();
				
				System.out.println(clave +" "+valor);
				
				resultado.put(clave,valor);
				///cant++;
				if(i == this.getN()-1)
					break;
			}
		
		return resultado;
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Archivo a=new Archivo();
		Juego j=a.leerArchivo("Archivos/Entrada/enunc.in");
		
		System.out.println("cant chicos "+j.getCantChicos());
		System.out.println("n "+j.getN());
			
		Map<String,Integer> resul = j.obtenerTopN();
		
		System.out.println("RESULTADO FINAL");
		for (String key1 : resul.keySet()) {
			System.out.println(key1.toString() + " " + resul.get(key1));
		}
		
		a.escribirArchivo("Archivos/Salida/enunc.out",resul);
	}

}
